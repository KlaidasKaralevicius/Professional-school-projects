-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2021 at 08:03 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `final`
--

-- --------------------------------------------------------

--
-- Table structure for table `projects`
--

CREATE TABLE `projects` (
  `ID` int(8) NOT NULL,
  `name` varchar(64) COLLATE utf32_swedish_ci NOT NULL,
  `description` varchar(256) COLLATE utf32_swedish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_swedish_ci;

--
-- Dumping data for table `projects`
--

INSERT INTO `projects` (`ID`, `name`, `description`) VALUES
(1, 'Laisez Faire', 'It\'s all about money, kaa ching kaa ching cash, my blood money and my little stash.'),
(2, 'Barbarossa', 'Gott mit uns.'),
(3, 'Vaccination', 'That will hurt just a little...'),
(4, 'In-Fidelity?', 'I did not have any sexual relations with that woman!'),
(6, 'Touch that leather', 'Leather to leather.'),
(8, 'Sultan', 'Erdogan strikes back.'),
(10, 'Biker Girl', 'She rode into town. She rode the town.'),
(11, 'Bangkok Nights', 'Ladyboys Delight, ft. DJ Vedaras.'),
(13, 'Test', 'Test your self'),
(16, 'COLORPRINTS', 'Create new or update Website'),
(17, 'Prometeus', 'Create a new network');

-- --------------------------------------------------------

--
-- Table structure for table `tasks`
--

CREATE TABLE `tasks` (
  `projectID` int(8) DEFAULT NULL,
  `ID` int(8) NOT NULL,
  `name` varchar(64) COLLATE utf32_swedish_ci NOT NULL,
  `description` varchar(256) COLLATE utf32_swedish_ci DEFAULT NULL,
  `priority` varchar(32) COLLATE utf32_swedish_ci NOT NULL,
  `status` varchar(32) COLLATE utf32_swedish_ci NOT NULL,
  `startDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_swedish_ci;

--
-- Dumping data for table `tasks`
--

INSERT INTO `tasks` (`projectID`, `ID`, `name`, `description`, `priority`, `status`, `startDate`, `modifiedDate`) VALUES
(1, 1, 'first', 'desription desription desription', 'low', 'todo', NULL, NULL),
(1, 2, 'second', 'desription desription desription', 'hight', 'completed', NULL, NULL),
(2, 3, 'third', 'desription desription desription', 'medium', 'in progress', NULL, NULL),
(3, 4, '4-th', 'desription desription desription', 'low', 'todo', NULL, NULL),
(3, 5, '5-th', 'desription desription desription', 'low', 'completed', NULL, NULL),
(3, 6, '6-th', 'desription desription desription', 'low', 'todo', NULL, NULL),
(3, 7, '7-th', 'desription desription desription', 'medium', 'todo', NULL, NULL),
(4, 8, '8-th', 'desription desription desription', 'hight', 'todo', NULL, NULL),
(4, 9, '9-th', 'desription desription desription', 'medium', 'completed', NULL, NULL),
(4, 10, '10-th', 'desription desription desription', 'low', 'completed', NULL, NULL),
(1, 21, 'asdg', 'asgf', 'high', 'todo', '2021-05-13 20:28:54', '2021-05-13 20:28:54'),
(1, 22, 'dh', 'dsfh', 'high', 'todo', '2021-05-15 20:23:59', '2021-05-15 20:23:59'),
(13, 23, 'Test your brain', 'you can do it with programming', 'low', 'completed', '2021-05-27 14:39:04', '2021-05-27 19:32:01'),
(16, 24, 'Preliminary inspection of the website', 'Evaluate the status of the website', 'high', 'completed', '2021-05-27 14:39:49', '2021-05-27 14:39:49'),
(16, 25, 'Meeting with the website architect', 'Architects suggestions and possibilities', 'low', 'todo', '2021-05-27 18:38:15', '2021-05-27 18:41:28'),
(16, 26, 'Interview with the customer', 'Listen to the customers wishes', 'high', 'in progress', '2021-05-27 18:39:01', '2021-05-27 18:42:28'),
(16, 27, 'Meeting with a team of programmers', 'Possibilities to update the website according to the architects instructions', 'medium', 'todo', '2021-05-27 18:44:44', '2021-05-27 18:44:44'),
(13, 28, 'Test your feelings', 'look at her or is she ugly to you?', 'high', 'in progress', '2021-05-27 18:46:40', '2021-05-27 19:33:57'),
(13, 29, 'Test your soul', 'go to the gym and to the church where you feel better?', 'medium', 'todo', '2021-05-27 18:47:51', '2021-05-27 18:47:51'),
(17, 30, 'Meeting at the facility', 'Meansure how many meters of internet cable will be needed in the building', 'low', 'completed', '2021-05-27 19:25:34', '2021-05-27 19:29:20'),
(17, 31, 'Network architect calculatotions', 'Network load calculation', 'low', 'completed', '2021-05-27 19:27:19', '2021-05-27 19:29:11'),
(17, 32, 'Purchase of equipment', 'Purchase of modems, wires  and switches', 'medium', 'in progress', '2021-05-27 19:28:51', '2021-05-27 19:28:51'),
(17, 33, 'Estimation', 'Estimation and determination of the term of works', 'high', 'todo', '2021-05-27 19:30:12', '2021-05-27 19:30:12'),
(17, 34, 'Mounting', 'Complete equipment connection and start-up', 'medium', 'todo', '2021-05-27 19:30:56', '2021-05-27 19:30:56'),
(13, 35, 'TEst your love', 'Hold me and dont let go. Love me.. bring flowers.. and things goes better. ', 'medium', 'todo', '2021-05-27 19:33:43', '2021-05-27 19:33:43'),
(11, 36, 'We go to the nightclub', 'Dance to fall .. dance all night..', 'low', 'completed', '2021-05-27 19:48:02', '2021-05-27 19:53:14'),
(11, 37, 'Go eat', 'We can go to a cafe, we can go to a restaurant', 'medium', 'in progress', '2021-05-27 19:51:27', '2021-05-27 19:51:27'),
(11, 38, 'Go to the museum', 'You can visit the war museum, you can visit the dress museum.', 'low', 'in progress', '2021-05-27 19:53:05', '2021-05-27 19:53:05'),
(11, 39, 'Return home', 'Buy tickets for a plane or boat', 'low', 'todo', '2021-05-27 19:54:24', '2021-05-27 19:54:24'),
(10, 40, 'Stop her', 'Check her drivers license', 'medium', 'completed', '2021-05-27 19:55:38', '2021-05-27 19:55:38'),
(10, 41, 'Get her interested', 'Ask her to take you home', 'low', 'completed', '2021-05-27 19:56:39', '2021-05-27 19:56:39'),
(10, 42, 'Meet', 'Meet her local biker club', 'medium', 'in progress', '2021-05-27 19:58:26', '2021-05-27 19:58:26'),
(10, 43, 'Suggest ', 'Offer her a hand and a heart . let us live long and happy.', 'high', 'todo', '2021-05-27 20:00:53', '2021-05-27 20:00:53');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(8) NOT NULL,
  `login` varchar(64) COLLATE utf32_swedish_ci NOT NULL,
  `password` varchar(64) COLLATE utf32_swedish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_swedish_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `login`, `password`) VALUES
(2, 'test@gmail.com', '2ec31a37dffab3bc8bf189775fcb8b64'),
(3, '', 'd41d8cd98f00b204e9800998ecf8427e'),
(4, 'indenas@tutu.lt', 'f506fd54fe26968252e662a3bd92ab1a'),
(5, 'dziumbras@kuku.lt', '621ac4e81667d8f70fd4a0e53ab74123'),
(6, 'kurva@gmail.com', '33a74fab61eeee300c5d175e149430fc');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `projects`
--
ALTER TABLE `projects`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tasks`
--
ALTER TABLE `tasks`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `projects`
--
ALTER TABLE `projects`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `tasks`
--
ALTER TABLE `tasks`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
