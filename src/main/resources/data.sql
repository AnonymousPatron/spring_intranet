-- 기본 직급 데이터
INSERT INTO position (name, description) VALUES ('사원', '신입');
INSERT INTO position (name, description) VALUES ('대리', '초급 관리자');
INSERT INTO position (name, description) VALUES ('과장', '중급 관리자');
INSERT INTO position (name, description) VALUES ('차장', '고급 관리자');
INSERT INTO position (name, description) VALUES ('부장', '부서 관리자');

INSERT INTO employee (name, email, phone, is_manager)
VALUES
    ('홍길동', 'hong@example.com', '010-1234-5678', false),
    ('김매니저', 'kim@example.com', '010-4321-8765', true);

INSERT INTO attendance_record (date, check_in_time, check_out_time)
VALUES
    ('2025-04-05', '09:03:00', '18:01:00'),
    ('2025-04-05', '08:50:00', '18:20:00');

INSERT INTO vacation_request (start_date, end_date, status)
VALUES
    ('2025-04-10', '2025-04-12', 'PENDING'),
    ('2025-04-15', '2025-04-16', 'APPROVED');

INSERT INTO attendance_summary (year, month, days_present)
VALUES
    (2025, 4, 20),
    (2025, 4, 22);