import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

group = "com.yugyd.buildlogic"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17

    // TODO Add signing to maven publish
    withJavadocJar()
    withSourcesJar()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    implementation(libs.update.versions.gradle.plugin)
    implementation(libs.ksp.gradle.plugin)
}

gradlePlugin {
    plugins {
        website = "https://github.com/Yugyd/idiomatic-android-gradle"
        vcsUrl = "https://github.com/Yugyd/idiomatic-android-gradle"

        // Android
        register("androidApplication") {
            id = "com.yugyd.buildlogic.convention.android.application"
            implementationClass =
                "com.yugyd.buildlogic.convention.android.AndroidApplicationPlugin"
            displayName = "Android application plugin"
            description = "Set sdk versions, config compileOptions and kotlin"
            tags.set(listOf("android", "application", "config"))
        }
        register("androidLibrary") {
            id = "com.yugyd.buildlogic.convention.android.library"
            implementationClass =
                "com.yugyd.buildlogic.convention.android.AndroidLibraryPlugin"
            displayName = "Android library plugin"
            description =
                "Set sdk versions, config compileOptions, config kotlin and disable unnecessary android tests"
            tags.set(listOf("android", "application", "config"))
        }

        // Build type
        register("buildTypeAndroidApplication") {
            id = "com.yugyd.buildlogic.convention.application.buildtype"
            implementationClass =
                "com.yugyd.buildlogic.convention.buildtype.BuildTypeAndroidApplicationPlugin"
            displayName = "Build type android application plugin"
            description = "Set build types and disable unused product flavor variants"
            tags.set(listOf("android", "application", "build-type"))
        }
        register("buildTypeAndroidLibrary") {
            id = "com.yugyd.buildlogic.convention.library.buildtype"
            implementationClass =
                "com.yugyd.buildlogic.convention.buildtype.BuildTypeAndroidLibraryPlugin"
            displayName = "Build type android library plugin"
            description = "Set build types and disable unused product flavor variants"
            tags.set(listOf("android", "library", "build-type"))
        }

        // Compose
        register("composeAndroidApplication") {
            id = "com.yugyd.buildlogic.convention.application.compose"
            implementationClass =
                "com.yugyd.buildlogic.convention.compose.ComposeAndroidApplicationPlugin"
            displayName = "Compose android application plugin"
            description =
                "Add compose compiler metrics, set compiler version, add bom and preview dependencies"
            tags.set(listOf("android", "application", "compose"))
        }
        register("composeAndroidLibrary") {
            id = "com.yugyd.buildlogic.convention.library.compose"
            implementationClass =
                "com.yugyd.buildlogic.convention.compose.ComposeAndroidLibraryPlugin"
            displayName = "Compose android library plugin"
            description =
                "Add compose compiler metrics, set compiler version, add bom and preview dependencies"
            tags.set(listOf("android", "library", "compose"))
        }

        // Jacoco
        register("jacocoAndroidApplication") {
            id = "com.yugyd.buildlogic.convention.application.jacoco"
            implementationClass =
                "com.yugyd.buildlogic.convention.jacoco.JacocoAndroidApplicationPlugin"
            displayName = "Jacoco android application plugin"
            description = "Set toolVersion, add jacoco test report task and config excludes and etc"
            tags.set(listOf("android", "application", "jacoco"))
        }
        register("jacocoAndroidLibrary") {
            id = "com.yugyd.buildlogic.convention.library.jacoco"
            implementationClass =
                "com.yugyd.buildlogic.convention.jacoco.JacocoAndroidLibraryPlugin"
            displayName = "Jacoco android library plugin"
            description = "Set toolVersion, add jacoco test report task and config excludes and etc"
            tags.set(listOf("android", "library", "jacoco"))
        }

        // Kotlin
        register("kotlinJvm") {
            id = "com.yugyd.buildlogic.convention.kotlin.jvm"
            implementationClass =
                "com.yugyd.buildlogic.convention.kotlin.KotlinJvmPlugin"
            displayName = "Kotlin jvm plugin"
            description = "Set java version to 11"
            tags.set(listOf("kotlin", "jvm", "config"))
        }

        // Lint
        register("lintAndroidApplication") {
            id = "com.yugyd.buildlogic.convention.application.lint"
            implementationClass =
                "com.yugyd.buildlogic.convention.lint.LintAndroidApplicationPlugin"
            displayName = "Lint android application plugin"
            description =
                "Set disables, enable abortOnError, disable checkReleaseBuilds, enable ignoreTestSources and warningsAsErrors"
            tags.set(listOf("android", "application", "lint"))
        }
        register("lintAndroidLibrary") {
            id = "com.yugyd.buildlogic.convention.library.lint"
            implementationClass =
                "com.yugyd.buildlogic.convention.lint.LintAndroidLibraryPlugin"
            displayName = "Lint android library plugin"
            description =
                "Set disables, enable abortOnError, disable checkReleaseBuilds, enable ignoreTestSources and warningsAsErrors"
            tags.set(listOf("android", "library", "lint"))
        }

        // Publish
        register("publishAndroidLibrary") {
            id = "com.yugyd.buildlogic.convention.library.publish"
            implementationClass =
                "com.yugyd.buildlogic.convention.publish.PublishAndroidLibraryPlugin"
            displayName = "Publish android library plugin"
            description = " Add maven repositories and publications config"
            tags.set(listOf("android", "library", "publish"))
        }
        register("publishKotlinJvm") {
            id = "com.yugyd.buildlogic.convention.kotlin.jvm.publish"
            implementationClass =
                "com.yugyd.buildlogic.convention.publish.PublishKotlinJvmPlugin"
            displayName = "Publish kotlin jvm plugin"
            description = " Add maven repositories and publications config"
            tags.set(listOf("kotlin", "jvm", "publish"))
        }
        register("publishPlatform") {
            id = "com.yugyd.buildlogic.convention.platform.publish"
            implementationClass =
                "com.yugyd.buildlogic.convention.publish.PublishPlatformPlugin"
            displayName = "Publish java platform plugin"
            description = " Add maven repositories and publications config"
            tags.set(listOf("java-platform", "publish"))
        }

        // Test
        register("testAndroidApplication") {
            id = "com.yugyd.buildlogic.convention.application.test"
            implementationClass =
                "com.yugyd.buildlogic.convention.test.TestAndroidApplicationPlugin"
            displayName = "Test android application plugin"
            description = "Add test instrumentation runner and set test options"
            tags.set(listOf("android", "application", "test"))
        }
        register("testAndroidLibrary") {
            id = "com.yugyd.buildlogic.convention.library.test"
            implementationClass =
                "com.yugyd.buildlogic.convention.test.TestAndroidLibraryPlugin"
            displayName = "Test android library plugin"
            description = "Add test instrumentation runner and set test options"
            tags.set(listOf("android", "library", "test"))
        }

        // Tools
        register("dependencyUpdates") {
            id = "com.yugyd.buildlogic.convention.dependency.updates"
            implementationClass = "com.yugyd.buildlogic.convention.tools.DependencyUpdatesPlugin"
            displayName = "Dependency updates plugin"
            description = "Config dependency updates plugin"
            tags.set(listOf("dependency-updates", "version-check", "tool"))
        }
        register("hiltAndroid") {
            id = "com.yugyd.buildlogic.convention.hilt"
            implementationClass = "com.yugyd.buildlogic.convention.tools.HiltAndroidPlugin"
            displayName = "Hilt plugin"
            description = "Add hilt plugin, library and ksp compiler"
            tags.set(listOf("di", "hilt", "tool"))
        }

        // Custom logic
        register("buildTypeApkVersion") {
            id = "com.yugyd.buildlogic.convention.buildtype.apk.version"
            implementationClass =
                "com.yugyd.buildlogic.convention.versionapk.BuildTypeApkVersionPlugin"
            displayName = "Debug version application plugin"
            description = "Add static version values in debug application"
            tags.set(listOf("android", "application", "apk-version"))
        }
    }
}

publishing {
    // TODO Add remote urls
    repositories {
        maven {
            val releasesRepoUrl = layout.buildDirectory.dir("repos/releases")
            val snapshotsRepoUrl = layout.buildDirectory.dir("repos/snapshots")

            name = "local"
            url = uri(
                if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            )
        }
    }
}
