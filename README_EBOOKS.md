# E-Books Platform - Java Swing Application

## Overview
A comprehensive Java Swing-based E-Books platform that provides digital library management with a user-friendly graphical interface. The application offers complete book management, user management, borrowing system, and administrative functions.

## Features

### Core E-Books Operations
- **User Management**
  - Create different user types (Student, Premium, Admin)
  - User authentication and profiles
  - User listing and management functionality

- **Book Management**
  - Add different types of books (Fiction, Non-Fiction, Academic)
  - Book catalog with metadata
  - Book search and filtering
  - Book ratings and reviews

- **Library System**
  - Borrow and return books
  - Book availability tracking
  - Due date management
  - Reading history and bookmarks

- **User Interface**
  - Modern Java Swing GUI
  - Login authentication system
  - Intuitive navigation between different modules
  - Error handling with user-friendly messages

### User Types
1. **Student User** - Can borrow 5 books, requires institution info
2. **Premium User** - Can borrow 10 books, has offline access
3. **Admin User** - Can borrow 20 books, manages the platform

### Book Types
1. **Fiction Books** - Novels, stories with sub-genres
2. **Non-Fiction Books** - Educational and reference materials
3. **Academic Books** - Course-specific textbooks

## Screenshots
![E-Books Platform Login](screenshot/1.png)
![E-Books Platform Menu](screenshot/2.png)

## Technologies Used
- **Java 17+** - Core programming language
- **Java Swing** - GUI framework
- **File I/O** - Data persistence
- **Exception Handling** - Robust error management

## Project Structure
```
src/
├── Application.java              # Main application entry point
├── Users/                        # User management system
│   ├── User.java                # Base user class
│   ├── StudentUser.java         # Student user implementation
│   ├── PremiumUser.java         # Premium user implementation
│   └── AdminUser.java           # Admin user implementation
├── Books/                        # Book management system
│   ├── Book.java                # Base book class
│   ├── FictionBook.java         # Fiction book implementation
│   ├── NonFictionBook.java      # Non-fiction book implementation
│   └── AcademicBook.java        # Academic book implementation
├── Library/                      # Main library management
│   └── Library.java             # Library class (replaces Bank)
├── GUI/                         # User interface components
│   ├── GUIForm.java            # Main GUI controller
│   ├── Login.java              # Login screen
│   ├── Menu.java               # Main menu
│   ├── AddUser.java            # User creation forms
│   ├── AddBook.java            # Book creation forms
│   ├── BorrowBook.java         # Borrowing functionality
│   ├── ReturnBook.java         # Return functionality
│   ├── SearchBooks.java        # Search functionality
│   ├── BookViewer.java         # Book reading interface
│   └── DisplayList.java        # Book listing
├── Data/
│   └── FileIO.java             # File operations
└── Exceptions/                  # Custom exception classes
    ├── InvalidUserData.java
    ├── InvalidBookData.java
    ├── MaxBorrowLimit.java
    ├── BookNotAvailable.java
    └── UserNotFound.java
```

## Installation & Setup

### Prerequisites
- Java Development Kit (JDK) 17 or higher
- Git (for cloning the repository)

### Installation Steps

1. **Clone the repository**
   ```bash
   git clone <>
   cd EBooksPlatform
   ```

2. **Compile the project**
   ```bash
   javac -d bin -cp src src/Application.java
   ```

3. **Run the application**
   ```bash
   java -cp bin Application
   ```

## Usage

### Login
1. Launch the application
2. Use the following credentials:
   - **Username:** `admin`
   - **Password:** `admin`
3. Click "Login" to access the main menu

### Main Operations

#### User Management
- **Create User**: Navigate to "Add User" and select user type
- **View Users**: Use "Display List" to see all users
- **User Details**: View user information and borrowing history

#### Book Management
- **Add Book**: Navigate to "Add Book" and select book type
- **Search Books**: Use "Search Books" to find specific books
- **View Books**: Use "Display List" to see all available books

#### Library Operations
- **Borrow Book**: Select "Borrow Book" from menu, enter user and book IDs
- **Return Book**: Select "Return Book" from menu, enter user and book IDs
- **View Availability**: Check book availability and due dates

### Navigation
- Use the main menu to navigate between different functions
- All forms include proper validation and error handling
- Confirmation dialogs for important operations

## Key Features

### Book Management
- **Metadata Support**: Title, author, ISBN, genre, description
- **File Management**: Support for PDF, EPUB, and other formats
- **Rating System**: User ratings and reviews
- **Categorization**: Fiction, Non-Fiction, Academic books

### User System
- **Role-Based Access**: Different permissions for different user types
- **Borrowing Limits**: Configurable limits per user type
- **Reading History**: Track user reading patterns
- **Bookmarks**: Save favorite books

### Library Features
- **Availability Tracking**: Real-time book availability
- **Due Date Management**: Automatic due date calculation
- **Overdue Detection**: Track overdue books
- **Statistics**: Library usage statistics

## Development

### Building from Source
```bash
# Compile all source files
javac -d bin -cp src src/**/*.java

# Run the application
java -cp bin Application
```

### Code Structure
- **MVC Pattern**: Clear separation between GUI, business logic, and data
- **Exception Handling**: Custom exceptions for different error scenarios
- **File Persistence**: Data is saved to `data.bin` file
- **Modular Design**: Each GUI component is a separate class

## Future Enhancements

- [ ] Database integration (replace file-based storage)
- [ ] Enhanced search with filters
- [ ] Book recommendation system
- [ ] Reading progress tracking
- [ ] Multi-language support
- [ ] Mobile app integration
- [ ] Cloud synchronization
- [ ] Advanced analytics and reporting

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- Java Swing framework for the GUI components
- Java community for excellent documentation and examples
- Contributors who have helped improve this project

## Support

For issues, questions, or contributions, please:
1. Check the existing issues in the repository
2. Create a new issue with detailed description
3. Follow the contribution guidelines

---

**Note**: This is a demonstration project for educational purposes. It showcases modern Java development practices and can be extended for real-world applications.
