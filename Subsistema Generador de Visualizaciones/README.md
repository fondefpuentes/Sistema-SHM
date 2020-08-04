# Vis4bridge Application
*Read this in other languages: [English](README.md), [Español](README.es.md)*
## Description
In this repository there are 3 sub-repositories necessary to build the Vis4bridge application.
These repositories are:

- vis4bridge.metamodel
  - Contains the Meta-model of the Vis4bridge application built with Ecore.
- vis4bridge.design
  - Contains the DSL built using Sirius.
- vis4bridge.acceleo
  - Contains the transformation from model to text (vis4bridge to dash) built with Acceleo.

## Instructions


1. Download from Obeo Designer Community

  This application was built using Obeo Designer Community Version 11.1.2 which is available for download at:

  [Obeo Designer Versions] (https://www.obeodesigner.com/en/download-previous-versions)

2. Upload the project vis4bridge.metamodel to the workspace

  - Open Obeo Designer Community and choose your working directory.
  - Go to the folder vis4bridge.metamodel and copy the content in your workspace.
  - Go to File-> import-> Existing Projects into Workspace.
  - Choose the project and press Finish

3. Upload the vis4bridge.design project to the workspace

  - Once the project vis4bridge.metamodel is loaded in your workspace, go to run-> run (or press Ctrl + F11). An eclipse environment will open at run time.
  - Choose your workspace to eclipse at runtime.
  - Once eclipse is open at runtime copy the contents of vis4bridge.design to the workspace.
  - Go to File-> import-> Existing Projects into Workspace.
  - Choose the project and press Finish

4. Upload the project vis4bridge.acceleo to the workspace

- Once the project vis4bridge.metamodel is loaded in your workspace, go to run-> run (or press Ctrl + F11). An eclipse environment will open at run time.
- Choose your workspace to eclipse at runtime.
- Once eclipse is open at runtime copy the contents of vis4bridge.acceleo to the workspace.
- Go to File-> import-> Existing Projects into Workspace.
- Choose the project and press Finish
