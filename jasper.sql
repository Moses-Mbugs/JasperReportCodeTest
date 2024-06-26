-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2024 at 10:28 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jasper`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_details`
--

CREATE TABLE `employee_details` (
  `Employee_ID` int(11) NOT NULL,
  `Employee_Name` varchar(255) DEFAULT NULL,
  `Department` varchar(255) DEFAULT NULL,
  `Salary_KSH` int(11) DEFAULT NULL,
  `Hire_Date` date DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `Contact_Information` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`Employee_ID`, `Employee_Name`, `Department`, `Salary_KSH`, `Hire_Date`, `Address`, `Contact_Information`) VALUES
(1, 'John Doe', 'Marketing', 80000, '2023-02-15', 'Nairobi', '0712345678'),
(2, 'Jane Smith', 'Finance', 100000, '2022-09-20', 'Ruaka', '0723456789'),
(3, 'Michael Johnson', 'Human Resources', 90000, '2023-05-10', 'Karen', '0734567890'),
(4, 'Emily Brown', 'Sales', 85000, '2024-01-08', 'Langata', '0745678901'),
(5, 'David Lee', 'Operations', 95000, '2023-11-30', 'Thika Road', '0756789012'),
(6, 'Sarah Garcia', 'Customer Service', 75000, '2022-12-05', 'Westlands', '0767890123'),
(7, 'Daniel Martinez', 'IT', 110000, '2024-03-17', 'Buruburu', '0778901234'),
(8, 'Jessica Rodriguez', 'Research & Development', 105000, '2023-08-22', 'Nairobi', '0789012345'),
(9, 'Kevin Wilson', 'Quality Assurance', 88000, '2022-07-14', 'Ruaka', '0790123456'),
(10, 'Amanda Taylor', 'Administration', 82000, '2024-04-02', 'Karen', '0801234567'),
(11, 'Chuck Norris', 'Marketing', 80000, '2024-03-01', 'Langata', '0812345678'),
(12, 'Black Panther', 'Sales', 85000, '2023-04-02', 'Ruaka', '0823456789'),
(13, 'Sam Witwicky', 'Human Resources', 90000, '2024-02-13', 'Nairobi', '0834567890'),
(14, 'Scooby Doo', 'Sales', 85000, '2022-01-22', 'Westlands', '0845678901'),
(15, 'Avatar Aang', 'Administration', 82000, '2022-01-23', 'Karen', '0856789012'),
(16, 'Adobe Reader', 'Marketing', 80000, '2022-01-24', 'Thika Road', '0867890123'),
(17, 'John Smith', 'IT', 110000, '2024-03-25', 'Buruburu', '0878901234'),
(18, 'Will Smith', 'Human Resources', 90000, '2023-01-26', 'Nairobi', '0889012345'),
(19, 'Kevin Hart', 'Research & Development', 105000, '2022-01-17', 'Ruaka', '0890123456'),
(20, 'Moses Mbugua', 'Administration', 82000, '2022-01-28', 'Karen', '0901234567'),
(21, 'Walter Genje', 'Quality Assurance', 88000, '2022-01-29', 'Langata', '0912345678'),
(22, 'Peter Parker', 'Customer Service', 75000, '2022-01-30', 'Thika Road', '0923456789'),
(23, 'Bruce Wayne', 'Finance', 100000, '2022-01-31', 'Westlands', '0934567890'),
(24, 'Clark Kent', 'Marketing', 80000, '2022-12-01', 'Karen', '0945678901'),
(25, 'Thor Odinson', 'Sales', 85000, '2022-08-02', 'Nairobi', '0956789012'),
(26, 'Wade Wilson', 'Quality Assurance', 88000, '2023-02-03', 'Ruaka', '0967890123'),
(27, 'Mwai Kibaki', 'Finance', 100000, '2024-04-04', 'Langata', '0978901234'),
(28, 'Jomo Kenyatta', 'Marketing', 80000, '2022-03-27', 'Thika Road', '0989012345'),
(29, 'William Ruto', 'Administration', 82000, '2023-08-30', 'Westlands', '0990123456'),
(30, 'Uhuru Kenyatta', 'Research & Development', 105000, '2023-02-27', 'Buruburu', '0101234567'),
(31, 'Raila Odinga', 'Sales', 85000, '2022-12-08', 'Nairobi', '0112345678'),
(32, 'Osama Abdi', 'Administration', 82000, '2023-02-01', 'Ruaka', '0123456789'),
(33, 'Adolf Hitler', 'IT', 110000, '2022-01-10', 'Karen', '0134567890'),
(34, 'George Bush', 'Customer Service', 75000, '2023-02-11', 'Langata', '0145678901'),
(35, 'Gojo Satoru', 'Human Resources', 90000, '2022-02-02', 'Thika Road', '0156789012'),
(36, 'Yuji Itadori', 'Administration', 82000, '2023-02-13', 'Westlands', '0167890123'),
(37, 'Martin Luther', 'Quality Assurance', 88000, '2022-11-04', 'Buruburu', '0178901234'),
(38, 'Bob Marley', 'Customer Service', 75000, '2022-09-15', 'Nairobi', '0189012345'),
(39, 'Mike Posner', 'Finance', 100000, '2024-02-16', 'Ruaka', '0190123456'),
(40, 'Kendrick Lamar', 'Marketing', 80000, '2023-03-17', 'Karen', '0201234567');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_details`
--
ALTER TABLE `employee_details`
  ADD PRIMARY KEY (`Employee_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee_details`
--
ALTER TABLE `employee_details`
  MODIFY `Employee_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
