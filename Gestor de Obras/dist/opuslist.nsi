; The name of the installer
Name "Opus List SPDVI"

; The file to write
OutFile "setup_opusList_v1.exe"

; Request application privileges for Windows Vista
RequestExecutionLevel admin

; Build Unicode installer
Unicode True

; The default installation directory
InstallDir $PROGRAMFILES32\OpusList

; Pages
Page components
Page directory
Page instfiles
UninstPage uninstConfirm
UninstPage instfiles

; The stuff to install

Section "Required files" required_files
    SectionIn RO
    SetOutPath $INSTDIR
    File Gestor_de_Obras.jar
    SetOutPath "$INSTDIR\lib"
    File lib\gson-2.8.7.jar
SectionEnd

Section "Initialize dummy data" dummy_data
    CreateDirectory "$LOCALAPPDATA\OpusList\data"
    SetOutPath "$LOCALAPPDATA\OpusList\data"
    File obres.json
    CreateDirectory "$LOCALAPPDATA\OpusList\images"
    SetOutPath "$LOCALAPPDATA\OpusList\images"
    File images\*.*
SectionEnd