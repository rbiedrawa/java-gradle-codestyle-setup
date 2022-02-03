# Getting Started

## Usage

### Gradle

Use below command to apply spotless code formatting steps

```shell
./gradlew spotlessApply
```

### Git pre-commit Hook

Run `spotlessApply` automatically on every commit.

#### Installation

1. Install pre-commit
	```shell
	brew install pre-commit
	```
2. Open new terminal and go to [java-gradle-codestyle-setup](./) directory
3. Install pre-commit hook using [.pre-commit-config.yaml](./.pre-commit-config.yaml)
	```shell
	pre-commit install
	```

#### Uninstall

```shell
rm ./.git/hooks/pre-commit
```

## References

* [Spotless gradle plugin](https://github.com/diffplug/spotless/tree/main/plugin-gradle)
* [Pre-commit](https://pre-commit.com/#usage)
* [palantir-java-format plugin](https://github.com/palantir/palantir-java-format)
* [Intelij Palantir Java Format plugin](https://plugins.jetbrains.com/plugin/13180-palantir-java-format/)
