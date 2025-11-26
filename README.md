# Java Mini Bank Account System

A beginner-friendly Java application that demonstrates essential OOP concepts using a simple bank account model. This project is ideal for anyone learning how classes, objects, methods, encapsulation, and basic validation work together in Java.

---

## 🚀 Features

- Create bank accounts with an account number, owner name, and initial balance  
- Deposit funds with basic validation  
- Withdraw funds with validation and success/failure return values  
- Retrieve current account balance  
- Clear console feedback for all actions  
- Encapsulated fields to protect account data  

---

## 🧰 Tech Stack

- **Java (JDK 17+)**  
- **IntelliJ IDEA Community Edition** or any Java IDE  
- Compatible with **Windows**, **macOS**, and **Linux**

---

## 📦 Getting Started

### 1. Install JDK

Verify installation:
```bash
java -version
```

### 2. Install IntelliJ IDEA

Download the Community Edition and open it with default settings.

### 3. Get the Project

Clone with Git:
```bash
git clone https://github.com/Patricia-Sigei/Mini-BankAccount.git
cd Mini-BankAccount
```

Or download the ZIP and extract it.

### 4. Open in IntelliJ

- Click **Open**
- Select the project folder
- Allow indexing to complete

---

## ▶️ Running the Application

1. Open `src/Main.java`
2. Click the green **Run** button next to the main method
3. Check the output in the console

### Sample Output:
```
Initial balance: $1000.0
Deposited: $500.0
Balance after deposit: $1500.0
Withdrew: $300.0
Final balance: $1200.0
Insufficient funds or invalid amount.
```

---

## 📁 Project Structure
```
src/
 ├── BankAccount.java   // Bank account logic
 └── Main.java          // Program entry point
```

---

## 📘 Code Overview

### BankAccount.java

#### Fields
```java
private String accountNumber;
private String ownerName;
private double balance;
```

#### Constructor
```java
public BankAccount(String accountNumber, String ownerName, double initialBalance) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = initialBalance;
}
```

#### Methods

**Get Balance**
```java
public double getBalance() {
    return balance;
}
```

**Deposit**
```java
public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    } else {
        System.out.println("Deposit amount must be positive.");
    }
}
```

**Withdraw**
```java
public boolean withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
        return true;
    } else {
        System.out.println("Insufficient funds or invalid amount.");
        return false;
    }
}
```

---

## 🧪 Testing Tips

Try additional scenarios in `Main.java`:
```java
BankAccount account2 = new BankAccount("ACC002", "Jane Smith", 5000);
account2.deposit(1000);
System.out.println(account2.getBalance());
```

Test invalid operations:
```java
account1.withdraw(20000); // should fail
```

---

## ⚠️ Common Issues

**IntelliJ can't resolve basic Java classes**  
Indexing isn't finished. Wait until it completes.

**SDK Not Configured**  
Go to: File → Project Structure → Project SDK → Add JDK

**Main class not found**  
Build → Rebuild Project

---

## 🌱 Enhancements

- Transfers between accounts
- Transaction history
- Store multiple accounts using lists or maps
- Console menu with Scanner
- Save/load accounts from files
- Interest calculations

---

## 📄 License

MIT License 

## Author
Patricia Sigei
