/*
 *    Copyright 2024 Roman Likhachev
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.yugyd.buildlogic.convention.buildtype

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.yugyd.buildlogic.convention.core.ANDROID_APPLICATION_ALIAS
import com.yugyd.buildlogic.convention.core.checkPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class BuildTypeAndroidApplicationPlugin : Plugin<Project> {

    companion object {
        private val ACTIVE_PRODUCT_FLAVOR_VARIANTS = arrayOf("debug", "staging", "release")
    }

    override fun apply(target: Project) {
        with(target) {
            checkPlugin(ANDROID_APPLICATION_ALIAS)

            extensions.configure<ApplicationExtension> {
                configureBuildTypes()

                disableUnusedProductFlavorVariants()
            }
        }
    }

    private fun Project.disableUnusedProductFlavorVariants() {
        // https://developer.android.com/build/build-variants#filter-variants
        extensions.configure<ApplicationAndroidComponentsExtension> {
            beforeVariants { variantBuilder ->
                if (!ACTIVE_PRODUCT_FLAVOR_VARIANTS.contains(variantBuilder.name)) {
                    variantBuilder.enable = false
                }
            }
        }
    }
}
