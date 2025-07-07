INSERT INTO LIVRES (ID, Titre, Auteur, ISBN, Categorie, Langue, Exemplaire, Disponibilite) VALUES
(1, 'Les Misérables', 'Victor Hugo', '9782070409189', 'Littérature classique', 'Français', 'MIS001', 'Disponible'),
(1, 'Les Misérables', 'Victor Hugo', '9782070409189', 'Littérature classique', 'Français', 'MIS002', 'Disponible'),
(1, 'Les Misérables', 'Victor Hugo', '9782070409189', 'Littérature classique', 'Français', 'MIS003', 'Disponible'),
(2, 'L''Étranger', 'Albert Camus', '9782070360022', 'Philosophie', 'Français', 'ETR001', 'Disponible'),
(2, 'L''Étranger', 'Albert Camus', '9782070360022', 'Philosophie', 'Français', 'ETR002', 'Disponible'),
(3, 'Harry Potter à l''école des sorciers', 'J.K. Rowling', '9782070643026', 'Jeunesse / Fantastique', 'Français', 'HAR001', 'Disponible');

INSERT INTO ADHERENTS (ID, NUM_ADHERENT, NOM, PROFIL,AGE) VALUES
(1, 'ETU001', 'Amine Bensaïd', 'Etudiant',18),
(2, 'ETU002', 'Sarah El Khattabi', 'Etudiant',18),
(3, 'ETU003', 'Youssef Moujahid', 'Etudiant',18),
(4, 'ENS001', 'Nadia Benali', 'Enseignant',18),
(5, 'ENS002', 'Karim Haddadi', 'Enseignant',18),
(6, 'ENS003', 'Salima Touhami', 'Enseignant',18),
(7, 'PROF001', 'Rachid El Mansouri', 'Professionnel',18),
(8, 'PROF002', 'Amina Zerouali', 'Professionnel',18);


INSERT INTO ABONNEMENTS (ID, NUM_ADHERENT, DATE_DEBUT, DATE_FIN, VALIDITE_ABONNEMENT) VALUES
(1, 'ETU001', '2025-01-01', '2025-12-31', 'OK'),
(2, 'ETU002', '2025-01-01', '2025-06-30', 'KO'),
(3, 'ETU003', '2025-03-01', '2025-12-31', 'OK'),
(4, 'ENS001', '2025-06-30', '2026-12-31', 'OK'),
(5, 'ENS002', '2025-08-01', '2026-06-30', 'KO'),
(6, 'ENS003', '2025-06-30', '2026-08-01', 'OK'),
(7, 'PROF001', '2025-06-01', '2025-12-31', 'OK'),
(8, 'PROF002', '2024-09-01', '2025-06-01', 'KO');

INSERT INTO QUOTAS (ID,NUM_ADHERENT, LIVRES_EMPRUNTES, JOURS_PRET, RESERVATION_LIVRES, PROLONGEMENT_PRET) VALUES
(1,'ETU001', 2, 5, 1, 1),
(2,'ETU002', 2, 5, 1, 1),
(3,'ETU003', 2, 5, 1, 1),
(4,'ENS001', 3, 10, 2, 2),
(5,'ENS002', 3, 10, 2, 2),
(6,'ENS003', 3, 10, 2, 2),
(7,'PROF001', 4, 12, 3, 3),
(8,'PROF002', 4, 12, 3, 3);

INSERT INTO EMPRUNTS (ID,NUM_ADHERENT, Exemplaire, DATE_EMPRUNT, DATE_RETOUR_PREVUE, DATE_RETOUR_REELLE, PROLONGATIONS) VALUES
(1,'ETU001', 'MIS001', '2025-07-01', '2025-07-06', NULL, 0),
(2,'ENS001', 'ETR001', '2025-07-02', '2025-07-12', NULL, 0);