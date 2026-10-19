# Unique Email Registration System

A console-based User Registration and Email Uniqueness Verification application built with Java. The system demonstrates core Java Collections Framework concepts (`HashSet`), input validation via regular expressions (Regex), case-insensitive data normalization, and constant-time duplicate detection.

---

## 🚀 Features

- **Email Format Validation**: Validates email format using regular expressions (`^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$`) to reject invalid addresses.
- **Duplicate Prevention**: Uses Java's `Set` interface backed by `HashSet` to ensure $O(1)$ average time complexity uniqueness checking.
- **Case-Insensitive Handling**: Automatically converts inputs to lowercase (e.g., `User@Example.com` and `user@example.com` are treated as the same user).
- **Whitespace Trimming**: Automatically sanitizes input by removing leading and trailing whitespace.
- **Live User Counter**: Dynamically reports the total count of registered users after each registration attempt.
- **Graceful Exit**: Type `exit` anytime to terminate the program cleanly.

---

## 🛠️ Technologies Used

- **Language**: Java (JDK 8 or higher)
- **Data Structure**: `java.util.HashSet` / `java.util.Set` for constant-time insertion and uniqueness enforcement
- **Pattern Matching**: Regular expression validation via `String.matches()`
- **Input Handling**: `java.util.Scanner` for interactive command-line input

---

## 📂 Project Structure

```text
├── Practise.java         # Contains the email validation and registration logic
├── README.md             # Project documentation
└── .gitignore            # Git ignore file for compiled bytecode (.class)
```

---

## ⚙️ Getting Started

### Prerequisites

Ensure you have the Java Development Kit (JDK) installed on your system. You can verify your installation by running:

```bash
java -version
javac -version
```

### Compilation

Compile the Java source file:

```bash
javac Practise.java
```

This will generate `Practise.class`.

### Execution

Run the compiled application:

```bash
java Practise
```

---

## 💻 Sample Execution

```text
Enter email (or exit): alice@example.com
Registration successful!
Total registered users: 1

Enter email (or exit): bob@domain.org
Registration successful!
Total registered users: 2

Enter email (or exit): Alice@example.com
Email already registered!
Total registered users: 2

Enter email (or exit): invalid-email-format
Invalid email address!

Enter email (or exit): exit
```

---

## 🧩 Code Overview

- **`Set<String> emails = new HashSet<>()`**: Stores registered email addresses with guaranteed uniqueness.
- **`emails.add(email)`**: The `Set.add()` method returns `true` if the item was added, or `false` if it was already present.
- **`email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")`**: Validates the presence of standard username, `@` symbol, domain name, and dot extension without illegal whitespace characters.
- **Data Normalization**: `.trim().toLowerCase()` guarantees consistent formatting before duplicate evaluation.
