#1
SELECT * FROM sports
JOIN sportGroups sG
ON sports.id = sG.sport_id
JOIN student_sport ss
ON sG.id = ss.sportGroup_id
JOIN students s
ON ss.student_id = s.id
WHERE s.name = 'Iliyan Ivanov';

#2
SELECT s.name FROM students s
JOIN student_sport ss
ON s.id = ss.student_id
JOIN sportGroups sG
ON ss.sportGroup_id = sG.id
JOIN coaches c
ON sG.coach_id = c.id
WHERE c.name = 'Ivan Todorov Petkov';

#3
SELECT sg.id, location, dayOfWeek, hourOfTraining, sport_id, coach_id, name FROM sportGroups sg
JOIN sports s on sg.sport_id = s.id
WHERE sg.sport_id = s.id OR sg.sport_id IS NULL ;


#4
SELECT sg.id, location, dayOfWeek, hourOfTraining, sport_id, coach_id, name FROM sportGroups sg
JOIN sports s on sg.sport_id = s.id
WHERE sg.sport_id = s.id  OR hourOfTraining IS NULL


#5
SELECT sg.id, location, dayOfWeek, hourOfTraining, sport_id, coach_id, name FROM sportGroups sg
JOIN sports s on sg.sport_id = s.id
WHERE sg.sport_id = s.id OR sg.sport_id IS NULL OR hourOfTraining IS NULL;


#7
SELECT location,hourOfTraining,dayOfWeek FROM sportGroups
WHERE sport_id = 2;