# DES Encryption/Decryption in Java - Group 7

## 📌 Description

This project implements encryption and decryption of text and files using the DES (Data Encryption Standard) algorithm in Java.

The application supports both text and file encryption (images, PDFs, etc.) through a simple console-based interface. It also includes key persistence, allowing the encryption key to be saved and reused.

---

## 🚀 Features

* Text encryption and decryption
* File encryption and decryption (images, PDFs, etc.)
* Key generation and storage
* Key loading for later decryption
* Console-based user interface

---

## ⚙️ Requirements

* Java JDK 17 or higher
* Command line / terminal
* Any operating system (Windows, Linux, macOS)

---

## ▶️ How to Run

Compile:

```
javac *.java
```

Run:

```
java Main
```

---

## ▶️ Usage

1. Start the program:

```
java Main
```

2. Choose key option:

* 1 → Generate new key
* 2 → Load existing key

3. Choose operation:

* Encrypt Text
* Decrypt Text
* Encrypt File
* Decrypt File

---

## 🔤 Text Encryption Guide

### 🔐 Encrypt Text

1. Choose option:

   ```
   1. Encrypt Text
   ```
2. Enter any text
3. Program outputs encrypted text

---

### 🔓 Decrypt Text

1. Choose option:

   ```
   2. Decrypt Text
   ```
2. Paste encrypted text
3. Program outputs original text

---

## 📷 File Encryption Guide

### 🔐 Encrypt File

* Input: original file (e.g. `photo.jpg`)
* Output: encrypted file (e.g. `encrypted.dat`)

---

### 🔓 Decrypt File

* Input: encrypted file (`encrypted.dat`)
* Output: restored file (e.g. `photo_decrypted.jpg`)

---

## ⚠️ Important Notes

* Do NOT use the same file name for input and output
* Encrypted files cannot be opened directly
* Keep the `secret.key` file safe — it is required for decryption
* Decryption will fail if the correct key is not used

---

## 📁 Project Structure

* DESUtil.java → Text encryption/decryption
* FileUtil.java → File encryption/decryption
* KeyUtil.java → Key saving/loading
* Main.java → Program execution

---

## 📸 Screenshots

### Main Menu

<img src = "https://github.com/gjelbrimmorina/DES-Implementation-Java/blob/416cfa8ff297dbceb99a35cc6110eea4c06d816a/screenshots/Main%20Menu.jpg" width = "600">

### Encrypt Text



### Decrypt Text



### Encrypt File



### Decrypt File



---

## 🔐 Security Note

DES is considered insecure today due to its short key length and vulnerability to brute-force attacks.

DES is used in this project for educational purposes only.

---

## 👥 Group

Group 7

## ✍️ Authors

Gjelbrim Morina
Arbenit Krasniqi
