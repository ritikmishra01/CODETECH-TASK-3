Name :- Mishra Ritik Sarojkumar 
Company Name :- CODETECH IT SOLUTIONS PVT LTD 
Intern ID :- CT04DG3359
Domain :- Java Programming 
Duration :- 30 June 2025 to 30 July 2025

# 💬 Java Client-Server Chat Application

A simple multithreaded client-server chat application using Java Sockets. This allows multiple clients to connect to a server and chat in real-time via the command line.

---

## 🚀 Features

- Server supports multiple clients using multithreading
- Real-time message broadcasting to all connected clients
- Simple text-based terminal interface

---

## 📁 Project Structure

```
JavaChatApp/
├── Server.java      # The server that handles multiple clients
├── Client.java      # Each client connects to the server
```

---

## 🛠 Requirements

- Java JDK 8 or later
- Command-line interface
- All files should be in the same folder

---

## 🔧 How to Compile and Run

### 🖥 Start the Server

```bash
javac Server.java
java Server
```

### 💻 Start Clients (in separate terminals)

```bash
javac Client.java
java Client
```

> 🔁 You can start multiple `Client` instances to simulate multiple users chatting.

---

## 📌 How it Works

- The `Server` listens on port **12345**.
- Each `Client` connects to the server and starts two threads:
  - One to **send** user input.
  - One to **receive** messages from the server.
- The server receives messages from clients and **broadcasts** them to all connected users.

---

## 🧪 Sample Interaction

**Terminal 1: Server**
```
Server is running on port 12345...
Client connected: /127.0.0.1
```

**Terminal 2: Client**
```
Connected to chat server. Type your messages:
Hi everyone!
```

**Terminal 3: Another Client**
```
Connected to chat server. Type your messages:
Hi everyone!
```

---

## 📜 License

This project is free to use for educational and personal purposes.

---

## 🙋 Support

Feel free to modify or improve this for your internship project or personal use!
