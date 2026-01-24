# Java GUI Examples

[![Java](https://img.shields.io/badge/Java-GUI-orange?logo=java)](https://www.oracle.com/java/)

Elegant, minimal, and educational Java Swing examples for learning basic GUI concepts.

**Table of Contents**

- [Overview](#overview)
- [Quick Start](#quick-start)
- [Examples](#examples)
- [Project Structure](#project-structure)
- [Notes](#notes)
- [Contributing](#contributing)
- [License](#license)

## Overview

This repository contains small, focused Java Swing examples intended for beginners learning how to build simple desktop UIs using `JFrame`, `JLabel`, and related Swing components. Each example is self-contained and easy to compile and run.

## Quick Start

Prerequisites: JDK installed and `javac`/`java` available on your PATH.

From the repository root, pick an example folder and run the following commands.

JFrame example (open a basic window):

```bash
cd Jframee
javac *.java
java JFrames
```

Label demo (image + text label):

```bash
cd Label
javac *.java
java LabelDemo
```

Notes:

- Each example expects an image file `logo.jpg` inside its folder (`Jframee/logo.jpg` or `Label/logo.jpg`). If the image is missing, the program still runs but will not show a custom icon.
- On Windows PowerShell, use the same commands; just run them in PowerShell instead of Bash.

## Examples

- **JFrame Example** — [JFrames.java](Jframee/JFrames.java): creates an instance of `MyFrame` which demonstrates window title, size, icon, background color, and basic frame properties. The actual frame implementation is in [Jframee/MyFrame.java](Jframee/MyFrame.java).
- **Label Demo** — [LabelDemo.java](Label/LabelDemo.java): demonstrates `JLabel` with icon, text positioning, fonts, borders, and `JFrame` packing.

## Project Structure

- [Jframee](Jframee): JFrame-centered example
  - [JFrames.java](Jframee/JFrames.java)
  - [MyFrame.java](Jframee/MyFrame.java)
- [Label](Label): JLabel and image/text demo
  - [LabelDemo.java](Label/LabelDemo.java)

## Notes

- These examples use the default (no) package and are intended for learning; for larger projects prefer proper packages and build tools (Maven/Gradle).
- If you get a `NoClassDefFoundError` or similar when running `java`, ensure you're running the `java` command from the same folder containing the compiled `.class` files (see Quick Start commands above).

## Contributing

Contributions are welcome. Open an issue or a pull request with small, focused improvements (additional examples, README fixes, or improvements to error handling).

## License

This repository is available under the MIT License. See LICENSE for details.
