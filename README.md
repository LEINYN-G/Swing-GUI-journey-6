# Swing-GUI-journey-6
a GUI is a UI, which uses graphics to interact with the user, GUI stands for Graphical User Interface. These can be buttons, menus, images, and more. The GUI for many programs differs in layout and exact function.
Swing GUI Quick StartJava Swing is a lightweight GUI (Graphical User Interface) toolkit used to build window-based applications. It is built on top of the older AWT (Abstract Window Toolkit) and is entirely written in Java.

Core Features:
-> Platform Independent: Components are painted by Java, ensuring a consistent look across OS platforms.
->Component-Rich: Offers advanced components like tables, trees, tabbed panes, and text areas.
->Pluggable Look and Feel: Allows dynamic switching of the application's visual style.
->MVC Architecture: Separates data (Model) from the visual display (View).
Basic Hierarchy:
JFrame: The main top-level window container.
JPanel: A generic container to organize components inside a frame.
JButton, JLabel, JTextField: Individual interactive components.

Common Layout Managers:
Layout managers control the positioning and sizing of components within containers.
FlowLayout: Places components in a row, wrapping to the next line if needed (Default for JPanel).
BorderLayout: Divides the container into five regions: North, South, East, West, and Center (Default for JFrame).
GridLayout: Arranges components in a rectangular grid of equal-sized cells.
BoxLayout: Lines up components either vertically or horizontally.
