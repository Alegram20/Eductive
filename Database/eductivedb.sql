-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2021 at 06:35 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eductivedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `surname`) VALUES
(1, 'Alexandros', 'Grammatikopoulos');

-- --------------------------------------------------------

--
-- Table structure for table `announcement`
--

CREATE TABLE `announcement` (
  `title` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `announcement`
--

INSERT INTO `announcement` (`title`, `description`, `category`, `date`) VALUES
(' English 2', ' 10:00 19/6', 'Exams', '2021-06-05'),
('Exams', 'Exams start at 11/6', NULL, '2021-06-05'),
('Maths', '12:00 24/6', 'Exams', '2021-06-04'),
('Physics', '9:00 22/6', 'Exams', '2021-06-05');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `professor_user` int(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`professor_user`, `title`, `description`, `start_date`, `end_date`) VALUES
(2, 'Maths', 'Bernouli ', '2021-06-11', '2021-06-24');

-- --------------------------------------------------------

--
-- Table structure for table `homework`
--

CREATE TABLE `homework` (
  `home_professor` int(255) NOT NULL,
  `home_course` varchar(255) NOT NULL,
  `home_title` varchar(255) NOT NULL,
  `home_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `homework`
--

INSERT INTO `homework` (`home_professor`, `home_course`, `home_title`, `home_date`) VALUES
(2, 'Maths', 'Exercise 2.1 from Bayes Theory', '2021-06-11');

-- --------------------------------------------------------

--
-- Table structure for table `parent`
--

CREATE TABLE `parent` (
  `id` int(9) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parent`
--

INSERT INTO `parent` (`id`, `name`, `surname`) VALUES
(4, 'Alex', 'Makrigiannis');

-- --------------------------------------------------------

--
-- Table structure for table `professor`
--

CREATE TABLE `professor` (
  `id` int(9) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `professor`
--

INSERT INTO `professor` (`id`, `name`, `surname`) VALUES
(2, 'Eirilena', 'Tsiaousi'),
(5, 'Nick', 'Apostolopoulos'),
(8, 'Test', 'Test1');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(9) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `surname`) VALUES
(3, 'Ioannis', 'Makantasis'),
(7, 'Nick ', 'Kalos'),
(9, 'Marinos', 'Alex');

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `prof_user` int(255) NOT NULL,
  `course_test` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `test_date` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`prof_user`, `course_test`, `title`, `test_date`) VALUES
(2, 'Maths', 'June 2021 Math Exam', '2021-06-18');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(9) NOT NULL,
  `email` varchar(255) NOT NULL,
  `usertype` set('Admin','Professor','Student','Parent') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `usertype`) VALUES
(1, 'alex@ceid.gr', 'Admin'),
(2, 'eirhlena@ceid.gr', 'Professor'),
(3, 'mak@ceid.gr', 'Student'),
(4, 'makri@ceid.gr', 'Parent'),
(5, 'nicka@ceid.gr', 'Professor'),
(6, ' j@ceid.gr', 'Professor'),
(7, ' kal@ceid.gr', 'Student'),
(8, ' test1@ceid,gr', 'Professor'),
(9, ' marin@ceid.gr', 'Student');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `announcement`
--
ALTER TABLE `announcement`
  ADD PRIMARY KEY (`title`),
  ADD KEY `cat_ann` (`category`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`title`),
  ADD KEY `profuser` (`professor_user`);

--
-- Indexes for table `homework`
--
ALTER TABLE `homework`
  ADD PRIMARY KEY (`home_title`),
  ADD KEY `homeprof` (`home_professor`),
  ADD KEY `homecourse` (`home_course`);

--
-- Indexes for table `parent`
--
ALTER TABLE `parent`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`title`),
  ADD KEY `testprof` (`prof_user`),
  ADD KEY `testcourse` (`course_test`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `manager_id` FOREIGN KEY (`id`) REFERENCES `users` (`id`);

--
-- Constraints for table `announcement`
--
ALTER TABLE `announcement`
  ADD CONSTRAINT `cat_ann` FOREIGN KEY (`category`) REFERENCES `announcement` (`title`);

--
-- Constraints for table `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `profuser` FOREIGN KEY (`professor_user`) REFERENCES `users` (`id`);

--
-- Constraints for table `homework`
--
ALTER TABLE `homework`
  ADD CONSTRAINT `homecourse` FOREIGN KEY (`home_course`) REFERENCES `course` (`title`),
  ADD CONSTRAINT `homeprof` FOREIGN KEY (`home_professor`) REFERENCES `users` (`id`);

--
-- Constraints for table `parent`
--
ALTER TABLE `parent`
  ADD CONSTRAINT `parent_id` FOREIGN KEY (`id`) REFERENCES `users` (`id`);

--
-- Constraints for table `professor`
--
ALTER TABLE `professor`
  ADD CONSTRAINT `professor_id` FOREIGN KEY (`id`) REFERENCES `users` (`id`);

--
-- Constraints for table `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `student_id` FOREIGN KEY (`id`) REFERENCES `users` (`id`);

--
-- Constraints for table `test`
--
ALTER TABLE `test`
  ADD CONSTRAINT `testcourse` FOREIGN KEY (`course_test`) REFERENCES `course` (`title`),
  ADD CONSTRAINT `testprof` FOREIGN KEY (`prof_user`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
