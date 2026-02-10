# Java GUI Examples

![Java](https://img.shields.io/badge/Java-Swing-orange?logo=java)
![JDK](https://img.shields.io/badge/JDK-8%2B-blue?logo=openjdk)
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20macOS%20%7C%20Linux-brightgreen)
![GUI](https://img.shields.io/badge/GUI-Java%20Swing-ffb000)
![Build](https://img.shields.io/badge/Build-javac%20CLI-blueviolet)
![Status](https://img.shields.io/badge/Status-Active-success)
![License](https://img.shields.io/badge/License-MIT-green)
![Contributions](https://img.shields.io/badge/Contributions-Welcome-2ea44f)
![Examples](https://img.shields.io/badge/Examples-Beginner%20Friendly-0aa2ff)

Clean, minimal Java Swing examples for beginners. Covers `JFrame`, `JLabel`, `JPanel`, and `JButton` with small, focused demos.

## Features

- Beginner-friendly and self-contained examples
- Each demo runs independently
- Simple structure with comments

## Quick Start

Prerequisites:

- JDK 8+ installed

Run a demo from the repository root.

JFrame example:

```bash
cd Jframee
javac *.java
java JFrames
```

Label demo:

```bash
cd Label
javac *.java
java LabelDemo
```

Panels demo:

```bash
cd Panels
javac *.java
java JavaPanel
```

Buttons demo:

```bash
cd Buttonss
javac *.java
java Main
```

Notes:

- Some examples expect image files like `logo.jpg` or `cat.png` in their folders. If missing, the app runs without icons.
- Run `java` from the same directory as the compiled `.class` files.

## What You Will See

- `Jframee`: Basic `JFrame` with title, fixed size, custom icon, and background color
- `Label`: `JLabel` with icon + text, fonts, borders, alignment, and packing
- `Panels`: `JPanel` layout with multiple colored panels
- `Buttonss`: `JButton` demo with a custom frame

## Project Layout

```
JavaGUI/
├── Buttonss/
│   ├── Main.java
│   └── MyFramee.java
├── Jframee/
│   ├── JFrames.java
│   └── MyFrame.java
├── Label/
│   └── LabelDemo.java
├── Panels/
│   └── JavaPanel.java
└── README.md
```

- [Jframee](Jframee): JFrame basics
- [Label](Label): Label components
- [Panels](Panels): Panel layouts
- [Buttonss](Buttonss): Button demo

## Contributing

Contributions are welcome.

- Fork the repo
- Create a feature branch
- Add your example or improvement
- Submit a pull request

## License

MIT License. See [LICENSE](LICENSE).
