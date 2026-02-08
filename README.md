# MonkeyType Automation

A Selenium-based automation project that automates typing tests on [Monkeytype.com](https://www.monkeytype.com/), a minimalistic typing test website. This project demonstrates web automation using Selenium WebDriver with Java.

## 🚀 Features

- **Automated Typing Test**: Automatically completes typing tests on Monkeytype.com
- **Cross-Browser Testing**: Supports Chrome, Firefox, and Edge browsers
- **TestNG Integration**: Uses TestNG for test management and parallel test execution
- **Cookie Handling**: Automatically accepts cookie consent dialogs
- **Smart Word Detection**: Detects and types active words in real-time
- **Parallel Test Execution**: Runs tests across multiple browsers simultaneously

## 📋 Prerequisites

- **Java 17** or higher
- **Maven 3.6+** for dependency management
- **Web Browsers**: Chrome, Firefox, and/or Edge installed on your system
- **WebDriver**: Compatible WebDriver executables for your browsers

## 🛠️ Technologies Used

- **Selenium WebDriver 4.17.0** - Browser automation
- **TestNG 7.9.0** - Testing framework
- **Maven** - Project management and build automation
- **Java 17** - Programming language

## 📦 Dependencies

The project includes the following main dependencies:

- Selenium Java 4.17.0
- TestNG 7.9.0
- Cucumber (Java & TestNG) 7.15.0
- REST Assured 5.4.0
- Mockito 5.8.0

## 🔧 Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd MonkeytypeAutomation
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Ensure WebDriver is configured**
   - Download appropriate WebDriver for your browser
   - Add WebDriver to your system PATH, or
   - Use WebDriverManager for automatic driver management

## 🚦 Usage

### Run the MonkeyType Automation

To run the main automation script:

```bash
mvn exec:java -Dexec.mainClass="org.example.MonkeyTypeAutomation.MonkeyType"
```

Or run directly from your IDE by executing the `MonkeyType.java` file.

### Run Cross-Browser Tests

To run the TestNG test suite with cross-browser testing:

```bash
mvn test
```

This will execute tests in parallel across Chrome, Firefox, and Edge browsers as configured in [testng.xml](testng.xml).

### Run Tests for Specific Browser

```bash
mvn test -Dbrowser=chrome
```

Available browser options: `chrome`, `firefox`, `edge`

## 📁 Project Structure

```
MonkeytypeAutomation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/
│   │   │       └── example/
│   │   │           ├── Main.java
│   │   │           └── MonkeyTypeAutomation/
│   │   │               └── MonkeyType.java
│   │   └── resources/
│   └── test/
│       └── java/
│           └── WebDriverManagerTest.java
├── pom.xml
├── testng.xml
├── browser.json
└── README.md
```

## 🎯 How It Works

1. **Launch Browser**: Opens Firefox browser (default)
2. **Navigate**: Goes to https://www.monkeytype.com/
3. **Handle Cookies**: Automatically accepts cookie consent if present
4. **Locate Input**: Finds the typing input box
5. **Type Words**: Continuously reads the active word and types it
6. **Word Tracking**: Monitors word index changes to ensure synchronization
7. **Complete Test**: Continues until the test finishes
8. **Cleanup**: Closes the browser

## ⚙️ Configuration

### TestNG Configuration

The [testng.xml](testng.xml) file configures parallel test execution:

- **Parallel Mode**: Tests run in parallel
- **Thread Count**: 3 threads (one per browser)
- **Browsers**: Chrome, Firefox, Edge

### Browser Selection

Modify the browser in `MonkeyType.java`:

```java
WebDriver driver = new FirefoxDriver();  // Change to ChromeDriver() or EdgeDriver()
```

## 🧪 Testing

The project includes TestNG-based tests for cross-browser compatibility. Tests are configured to run on:

- **Chrome**
- **Firefox** 
- **Edge**

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 Notes

- The automation waits up to 30 seconds for elements to load
- Cookie consent is handled automatically with a timeout fallback
- The typing loop continues until no more active words are detected
- Tests can run in parallel for faster execution

## ⚠️ Disclaimer

This project is for educational purposes only. Please use responsibly and in accordance with Monkeytype.com's terms of service.

## 📄 License

This project is available for educational and personal use.

## 👤 Author

**ROHIT TUDU** - [@ReaganBlade](https://github.com/ReaganBlade)

## 🙏 Acknowledgments

- [Monkeytype.com](https://www.monkeytype.com/) for providing an excellent typing test platform
- Selenium WebDriver community for comprehensive documentation
- TestNG for the robust testing framework
