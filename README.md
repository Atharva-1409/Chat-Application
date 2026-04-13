# 💬 Real-Time Chat Application (Java Sockets)

A real-time chat application built using Java sockets that enables multiple clients to communicate simultaneously with efficient message handling and concurrent processing.

---

## 🚀 Features

* 🔹 Multi-client communication (multiple users connected at once)
* 🔹 Real-time message broadcasting
* 🔹 Thread-based concurrency (each client handled independently)
* 🔹 TCP socket communication
* 🔹 Lightweight and terminal-based

---

## 🧠 Concepts Used

* Java Networking (Socket, ServerSocket)
* Multithreading (Thread, Runnable)
* Input/Output Streams
* Client-Server Architecture

---

## 🏗️ Project Structure

```
chat-app/
│
├── Server.java      # Handles clients and message broadcasting
├── Client.java      # Client-side communication
└── README.md
```

---

## ⚙️ How It Works

1. The server starts and listens on a specific port.
2. Clients connect to the server using sockets.
3. Each client is handled in a separate thread.
4. Messages sent by one client are broadcast to all other clients.

---

## ▶️ How to Run

### 🔧 Compile

```bash
javac Server.java Client.java
```

### ▶️ Start Server

```bash
java Server
```

### 💻 Run Clients (in multiple terminals)

```bash
java Client
```

---

## 🖼️ Sample Usage

```
Server started...
New client connected
New client connected
```

Client 1:

```
Hello
```

Client 2:

```
Hello
```

---

## 🔥 Future Improvements

* Add usernames for each client
* Private messaging system (/msg username)
* Active users list (/users)
* Chat timestamps
* GUI using Swing or JavaFX
* File sharing support
* End-to-end encryption (AES)

---

## 💡 Why This Project?

This project demonstrates core networking and concurrency concepts in Java while building a functional real-time system. It is ideal for:

* Learning socket programming
* Understanding multi-threaded systems
* Showcasing backend communication skills
* Strengthening GitHub portfolio

---

## 📌 Author

**Atharva Sable**

---

## ⭐ Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests.

---

## 📄 License

This project is open-source and available under the MIT License.
