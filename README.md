<!-- prettier-ignore -->
# Java GUI Examples

![Java](https://img.shields.io/badge/Java-GUI-orange?logo=java)

A small collection of focused Java Swing examples — clean, minimal, and ideal for learning basic desktop UI concepts.

## Quick Start

Requirements: JDK (javac/java) installed.

Run an example from the repository root:

JFrame example

```bash
cd Jframee
javac *.java
java JFrames
```

Label demo

```bash
cd Label
javac *.java
java LabelDemo
```

Notes

- Each example looks for `logo.jpg` in its folder (e.g., `Jframee/logo.jpg`). If it's missing the app still runs without the custom icon.
- Run the `java` command from the same directory as the compiled `.class` files.

## What you'll see

- `Jframee` — a basic `JFrame` window with title, fixed size, icon, and background color.
- `Label` — a `JLabel` demo showing icon + text, font, border, alignment, and packing.
- `Panels` — a simple `JPanel` layout demo showing multiple colored panels and adding components to a panel (uses `Panels/cat.png`).

## Project layout

- [Jframee](Jframee)
  - [JFrames.java](Jframee/JFrames.java)
  - [MyFrame.java](Jframee/MyFrame.java)
- [Label](Label)
  - [LabelDemo.java](Label/LabelDemo.java)
- [Panels](Panels)
  - [JavaPanel.java](Panels/JavaPanel.java)

## Tips

- For multi-file projects prefer a build tool (Maven/Gradle) and proper Java packages.
- To add a screenshot: place an image under `docs/` and reference it from the README.