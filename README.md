# Reference project template with code style settings for Java / Gradle projects

This repository contains code style settings that can be used to ensure formatting consistency inside Java / Gradle projects.

Project is configured to use [Spotless](https://github.com/diffplug/spotless) with [Palantir java format](https://github.com/palantir/palantir-java-format) which is based on
the [Google java format](https://github.com/google/google-java-format).

# Getting Started

## Usage

### Gradle

Use below command to apply `Spotless` code formatting steps

```shell
./gradlew spotlessApply
```

### Git (pre-commit Hook)

Run `spotlessApply` automatically on every commit.

#### Installation:

1. Install pre-commit
	```shell
	brew install pre-commit
	```
2. Open new terminal and go to **project** directory
3. Install pre-commit hook using [.pre-commit-config.yaml](./.pre-commit-config.yaml)
	```shell
	pre-commit install
	```

#### Uninstall:

```shell
rm ./.git/hooks/pre-commit
```

### Intelij plugin

#### Installation:

A [palantir-java-format IntelliJ plugin](https://plugins.jetbrains.com/plugin/13180-palantir-java-format/)
is available from the plugin repository. To install it, go to your IDE's settings and select the `Plugins` category.
Click the `Marketplace` tab, search for the `palantir-java-format` plugin, and click the `Install` button.

#### Usage:

The plugin will be disabled by default on new projects but if using the `com.palantir.java-format` gradle plugin, it
will be recommended in IntelliJ and automatically configured.

To manually enable it in the current project, go to `File→Settings...→palantir-java-format Settings` (
or `IntelliJ IDEA→Preferences...→Other Settings→palantir-java-format Settings` on macOS) and check
the `Enable palantir-java-format` checkbox.

When enabled, it will replace the normal `Reformat Code` action, which can be triggered from the `Code` menu or with the
Ctrl-Alt-L (by default) keyboard shortcut.

#### Caution:

Custom [codeStyles](./.idea/codeStyles) settings are stored inside this repository and they will be used automatically, in order to ensure correct import orders and other formatting rules inside Intelij IDE.

## References

* [Spotless gradle plugin](https://github.com/diffplug/spotless/tree/main/plugin-gradle)
* [Pre-commit](https://pre-commit.com/#usage)
* [Palantir Java Format plugin](https://github.com/palantir/palantir-java-format)
* [Intelij Palantir Java Format plugin](https://plugins.jetbrains.com/plugin/13180-palantir-java-format/)

## License

Distributed under the MIT License. See `LICENSE` for more information.
