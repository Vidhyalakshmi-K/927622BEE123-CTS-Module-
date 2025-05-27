SELECT 
    A.event_id,
    A.session_id AS session1_id,
    B.session_id AS session2_id,
    A.title AS session1_title,
    B.title AS session2_title,
    A.start_time AS session1_start,
    A.end_time AS session1_end,
    B.start_time AS session2_start,
    B.end_time AS session2_end
FROM sessions A
JOIN sessions B 
    ON A.event_id = B.event_id 
    AND A.session_id < B.session_id
WHERE 
    A.start_time < B.end_time 
    AND A.end_time > B.start_time;
