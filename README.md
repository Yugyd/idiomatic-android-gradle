Idiomic Android Gradle
======================

A typical Android project, with current best practices from the Gradle and Android team. Suitable
for starting a project from scratch or testing and reviewing certain approaches.

Build logic
===========

# For profiling use build-scan and gradle-profiler

The main scripts for gradle-profiler can be found in the directory [/build-logic/performance/].

[Learn more](https://docs.gradle.org/current/userguide/performance.html#inspect_your_build)

# Keep Android Studio and SDK tools up to date

[Learn more](https://developer.android.com/build/optimize-your-build#update)

# Keep Gradle, Android Gradle Plugin and Kotlin up to date

- Gradle: 8.3
- Android Gradle Plugin: 8.1.1
- Kotlin: 1.8.22

[Learn more](https://developer.android.com/build/optimize-your-build#update)

[Learn more](https://docs.gradle.org/current/userguide/performance.html#update_versions)

# Keep Third-party plugins up to date

Update third-party plugins in a timely manner.

[Learn more](https://docs.gradle.org/current/userguide/performance.html#plugins)

# Use KSP instead of kapt

[Learn more](https://developer.android.com/build/optimize-your-build#migrate_to_ksp)

# Debug build uses a limited set of resources

- English locale
- Dimensions xxhdpi

[Learn more](https://developer.android.com/build/optimize-your-build#reduce_resources)

# Use static build config values with your debug build

[Learn more](build-logic/customlogic/src/main/kotlin/BuildTypeApkVersionPlugin.kt)

[Learn more](https://developer.android.com/build/optimize-your-build#use_static_build_properties)

# Convert images to WebP

[Learn more](https://developer.android.com/build/optimize-your-build#use_webp)

# Disable PNG crunching

Disabled by default for `debug` since AGP 3.0, if you have other build types,
disable `isCrunchPngs`.

[Learn more](https://developer.android.com/build/optimize-your-build#disable_crunching)

# Use and experiment parallel GC

Always check which GC is better for your project: `G1GC` (default) or `ParallelGC`.
Here `ParallelGC` is used.

[Learn more](https://developer.android.com/build/optimize-your-build#experiment-with-the-jvm-parallel-garbage-collector)

# Increase the JVM heap size (default on project for 16 RAM)

See recommendations in gradle.properties in the comment to `org.gradle.jvmargs`.

It is better to carry out tests for frequently encountered cars, so that there is no swap and
friezes when development.

[Learn more](https://developer.android.com/build/optimize-your-build#increase-the-jvm-heap-size)

[Learn more](https://docs.gradle.org/current/userguide/performance.html#increase_the_heap_size)

# Use non-transitive R classes

[Learn more](https://developer.android.com/build/optimize-your-build#use-non-transitive-r-classes)

# Use non-constant R classes

[Learn more](https://developer.android.com/build/optimize-your-build#use-non-constant-r-classes)

# Disable the Jetifier flag

If for some reason you use jetifier, discard the outdated libraries or repackage (use androidx) the
libraries.

[Learn more](https://developer.android.com/build/optimize-your-build#disable-the-jetifier-flag)

# Use the configuration cache

If you are using plugins that do not support cache, enable
the `org.gradle.configuration-cache.problems=warn` flag, and the cache itself must be disabled.

[Learn more](https://developer.android.com/build/optimize-your-build#use-the-configuration-cache)

[Learn more](https://docs.gradle.org/current/userguide/performance.html#enable_configuration_cache)

# Enable parallel execution

[Learn more](https://docs.gradle.org/current/userguide/performance.html#parallel_execution)

# Enable the Gradle Daemon

[Learn more](https://docs.gradle.org/current/userguide/performance.html#enable_daemon)

# Enable incremental build for custom tasks and plugins

If you have Third-Party or your own logic, check the problems for incrementality.

[Learn more](https://docs.gradle.org/current/userguide/performance.html#enable_incremental_build_for_custom_tasks)

# Enable the build cache

[Learn more](https://docs.gradle.org/current/userguide/performance.html#enable_the_build_cache)

[Learn more](https://docs.gradle.org/current/userguide/build_cache.html)

## Flexible configuration of builds on CI and local machines

CI: uses remote cache, can push to remote cache.

Local machine: uses the remote cache, cannot push to the remote cache, so as not to break
remote cache.

## Unified Environment

Always use the same version of Java on CI and on local machines.

- Select the optimal Java version and vendor
- Instruct developers to use a single version of Java
- Or preinstall the environment at the gradle-user-home level
- Or make a custom gradle-wrapper and distribute it through your server

## Use the Android Cache Fix Gradle Plugin

Be sure to check the builds for cache miss. Example, if you use Room, then there is a cache problem
miss
with [the schema file](https://github.com/gradle/android-cache-fix-gradle-plugin#roomschemalocationworkaround).

[Learn more](https://github.com/gradle/android-cache-fix-gradle-plugin)

# Use the sample-app pattern

Coming Soon!

[Learn more](https://docs.gradle.org/current/userguide/performance.html#create_builds_for_specific_developer_workflows)

# Optimize Configuration

- Files are not read during configuration
- There is no rigid connection between the 'allprojects' or 'subprojects' plugins
- Uses static Kotlin and conevention plugins instead of Groovy scripts

Coming Soon! You need to analyze the entire assembly.

[Learn more](https://docs.gradle.org/current/userguide/performance.html#optimize_configuration)

# Optimize Dependency resolution

[Learn more](https://docs.gradle.org/current/userguide/performance.html#dependency_resolution)

[Learn more](https://developer.android.com/build/optimize-your-build#gradle_plugin_portal)

## Avoid unnecessary dependencies

If you only use a small portion of the library, consider writing your own implementation or looking
for a lightweight library.

## Avoid unused dependencies

Disable unused libraries, you can use various plugins.

Coming Soon! Select a plugin.

## Optimize repository order

## Minimize dynamic and snapshot versions

## Minimize repository count

If you have Nexus or another dependency proxy. Leave one point, you will reduce the number of
requests. Uncomment the required code in `setting.gradle`.

## Avoid dependency resolution during configuration

[Learn more](https://docs.gradle.org/current/userguide/performance.html#switch_to_declarative_syntax)

# Optimize tests

[Learn more](https://docs.gradle.org/current/userguide/performance.html#optimize_java_projects)

## Use mocks with caution

May slow down tests. If possible, you can use fakes.

Coming Soon! Make average test results and add scripts for gradle-profiler.

[Learn more](https://developer.android.com/training/testing/fundamentals/test-doubles#types)

[Learn more](https://martinfowler.com/articles/mocksArentStubs.html)

## Execute tests in parallel

Coming Soon!

## Fork tests into multiple processes

Coming Soon! Testing and report.

## Disable reports

Coming Soon! Add flexible settings to enable and disable reports.

# Multi-module project structure

[Learn more](https://developer.android.com/topic/modularization)

[Learn more](https://developer.android.com/build/optimize-your-build#create_libraries)

## Parallel build

Use multimodularity to achieve maximum build paralysis and feature isolation.

## Use the Kotlin modules kind as much as possible

Coming Soon!

- Add convention plugin for the Kotlin module
- Make sample modules using pure Kotlin

[Learn more](https://developer.android.com/topic/modularization/patterns#prefer-kotlin)

## Use dependency artifact transformation aar to jar

To most often use pure Kotlin modules, the aar to jar transformation is used.

Coming Soon!

- Add a plugin with aar to jar transformation
- Make a sample module using transformation
- Add links to useful resources

# Reduce application size and remove unused project resources and code

- Follow best practices from the Android team to reduce the weight of your apk
- Do periodic cleaning
- Use static code analyzers to promptly remove unused code

# BuildConfig is not used in submodules and other buildfeatures

`buildfeatures` are disabled in Gradle 8.0 by default, if you have a lower version of Gradle,
disable it for yourself.

Coming Soon! Add sample how to use global BuildConfig.

[Learn more](https://developer.android.com/build/releases/past-releases/agp-8-0-0-release-notes#default-changes)

# Engineer build

# Using minSdk 24+ or minSdk custom local parameter

If your project has minSdk version less than 24, use minSdk 24+ on development machines, and
minSdk < 24 on CI.

Coming Soon! Add sample custom parameter minSdk.

# Don't use flavors

Avoid combinatorial explosion of tasks on your project. If you need to separate your product into
different flavors, use the gradle property and custom build logic.

Coming Soon! Add sample implementation of taste via gradle property.

# Carefully use connecting modules via ':name:name:name'

This construction will create not one project (`:project:core:uikit`), but three
projects: `project`, `core`, `uikit`. This means that these projects will participate in the
configuration.

If the configuration is slow: write a plugin that will connect modules or use patches.

Coming Soon!

- Write and test a plugin
- Test and add results to see how much the configuration differs

# Don't configure unnecessary build types in modules

For submodules, only the debug or release option is used. Use matchingFallbacks.

Coming Soon! Test and add results to see how much the configuration differs.

# Use groovy build scripts instead of kotlin

Coming Soon! Add links for performance comparison.

# Use version catalog

In general, this functionality is constantly being improved by the Gradle team and it is convenient.

[Learn more](https://developer.android.com/build/migrate-to-catalogs)

[Learn more](https://docs.gradle.org/current/userguide/platforms.html)

Build principles
================

Coming Soon!

CI/CD
=====

# Gitlab implementation

Coming Soon!

# Github implementation

Coming Soon!

Alternative build system
========================

Coming Soon! Bazel implementation branch.

Template code
=============

Coming Soon!

- Tab navigation with 5 fragments
- Each tab has a graph of 10 fragments
- About 50 features
- About 100 modules

# Base project file structure

- app: main project configuration, application build
- build-logic: project build logic
- docs: accompanying documentation for the project
- gradle: everything related to gradle is the wrapper and libs directory
- product: the project code base, here is all the functionality of the application
- sample-app: project configuration of dependencies that a developer needs to develop a feature

# Stack template project

* Language: Kotlin
* Architecture: MVVM (Google), clean, multi-module
* UI: Compose, Material 3
* Navigation: Jetpack Compose Navigation
* DI: Hilt
* Testing: Coming Soon!

# Build types

`debug` - Logging, debug mode, proguard off.

`release` - No logging, no debug mode, proguard enabled.

# Contributions

[Guide](docs/CONTRIBUTION.md)

# License

```
   Copyright 2023 Roman Likhachev

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
