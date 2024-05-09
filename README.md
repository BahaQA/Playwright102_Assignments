<!-- TABLE OF CONTENTS -->
<h2>
    <details open="open">
        <summary class="normal">Table of Contents</summary>
        <h5>
          <ol>
            <li>
              <a href="#about-the-project">About the Project</a>
              <ul>
                <li><a href="#built-with">Built With</a>
              </ul>
            </li>
            <li>
              <a href="#getting-started">Getting Started</a>
              <ul>
                <li><a href="#prerequisites">Prerequisites</a>
                <li><a href="#installation">Installation</a>
              </ul>
            </li>
            <li><a href="#usage">Usage</a></li>
            <li><a href="#reports">Reports</a></li>
          </ol>
        </h5>    
    </details>
</h2>

<!-- ABOUT THE PROJECT -->

## About the Project

This project is based on Microsoft Playwright
- Auto-waits for all the relevant checks to pass and only then performs the requested action.
- Supports Headful/Headless mode execution for Firefox/Webkit/Google Chrome/Chromium/MS Edge on Windows/Linux/Mac
  machines.
- Rerun Failed Test cases
- Supports Serial and Parallel execution.
- Spark PDF/HTML Reports are generated after execution with an option to capture screenshot/video/trace file on failure.


### Built With

- [Playwright](https://playwright.dev)
- [Cucumber](https://cucumber.io/)
- [JUnit](https://junit.org/junit5/)
- [Maven](https://maven.apache.org/)
- [OpenJDK](https://www.openlogic.com/openjdk-downloads)

## Configure .gitpod.yml
tasks:
- name: Install Dependencies
  command: |
  mvn install

- name: Install Playwright with Chromium (Java)
  command: |
  mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="install chrome"
