# README: Pet Food Advertisement and Keyword Search System

## Overview
This project is a Java-based tool designed to create personalized advertisements for pet food products. It collects data from social media, scrapes product reviews from Walmart, and matches keywords to generate targeted ads. The system is divided into three main parts:

1. **Data Collection**: Reads social media posts and keywords from input files.
2. **Review Scraping**: Gathers product reviews from Walmart's website and saves them into a CSV file.
3. **Keyword Matching**: Analyzes reviews for target keywords and generates appropriate advertisements.

## Project Components

### 1. **DataCollector Class**
- Manages social media posts and keywords.
- Reads input files containing social media posts and target words.
- Provides methods to retrieve posts and words sequentially.
- Prepares advertisements by combining usernames and custom ad messages.

### 2. **Walmart Class**
- Scrapes product reviews from Walmart's website using the Jsoup library.
- Extracts reviewer names, ratings, review content, and other details.
- Saves all reviews to a file named `reviews.csv` for further processing.

### 3. **keywordSearch Class**
- Reads keywords from a file and analyzes reviews stored in `reviews.csv`.
- Matches keywords in reviews to calculate a suitability rating.
- Generates ads based on the rating:
  - High rating: Premium headphones ad.
  - Medium rating: Basic earphones ad.
  - Low rating: No ad.
- Saves generated ads in `advertisement.csv`.

## How to Use

### Prerequisites
- Java Development Kit (JDK) installed.
- Internet access for scraping reviews.
- Input files:
  - `keywords.txt` containing target keywords.
  - Files with social media posts.

### Steps to Run
1. Compile the Java files:
   ```
   javac DataCollector.java Walmart.java keywordSearch.java
   ```

2. Scrape reviews from Walmart:
   ```
   java Walmart
   ```
   - Reviews are saved in `reviews.csv`.

3. Run the keyword matching program:
   ```
   java keywordSearch
   ```
   - Generated ads are saved in `advertisement.csv`.

## Outputs

- **`reviews.csv`**: Contains scraped reviews with details like reviewer name, review text, star rating, and verification status.
- **`advertisement.csv`**: Stores personalized advertisements based on keyword relevance.

## Key Features
- **Data Management**: Handles input and output files efficiently.
- **Web Scraping**: Collects data from Walmart using Jsoup.
- **Keyword Matching**: Evaluates relevance of reviews to create targeted ads.

## Limitations
- The scraper depends on Walmart's website structure. Changes in the structure may require updates to the code.
- Keyword matching is basic and may not capture the full context of reviews.

## Future Enhancements
- Integrate advanced natural language processing for better review analysis.
- Expand support for additional e-commerce platforms.

## Author
Developed by [Your Name]. All rights reserved.

