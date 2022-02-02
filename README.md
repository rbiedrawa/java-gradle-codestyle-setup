# Getting Started

## TODO

Intelij idea imports order

## Usage

1. Run below command to perform spotless

```shell
./gradlew spotlessApply
```

## IntelliJ plugin

A [palantir-java-format IntelliJ plugin](https://plugins.jetbrains.com/plugin/13180)
is available from the plugin repository. To install it, go to your IDE's settings and select the `Plugins` category.
Click the `Marketplace` tab, search for the `palantir-java-format` plugin, and click the `Install` button.

The plugin will be disabled by default on new projects, but as mentioned [above](#compalantirjava-format-gradle-plugin),
if using the `com.palantir.java-format` gradle plugin, it will be recommended in IntelliJ, and automatically configured.

To manually enable it in the current project, go to `File→Settings...→palantir-java-format Settings` (
or `IntelliJ IDEA→Preferences...→Other Settings→palantir-java-format Settings` on macOS) and check
the `Enable palantir-java-format` checkbox.

To enable it by default in new projects, use `File→Other Settings→Default Settings...`.

When enabled, it will replace the normal `Reformat Code` action, which can be triggered from the `Code` menu or with the
Ctrl-Alt-L (by default) keyboard shortcut.

## References

* [Spotless gradle plugin](https://github.com/diffplug/spotless/tree/main/plugin-gradle)
* [palantir-java-format plugin](https://github.com/palantir/palantir-java-format)
* [Intelij Palantir Java Format plugin](https://plugins.jetbrains.com/plugin/13180-palantir-java-format/)
* [Intelij Spotless Gradle plugin](https://plugins.jetbrains.com/plugin/18321-spotless-gradle)
