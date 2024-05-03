SELECT 
    coalesce(community_id, 'all_communities') as community_id, 
    coalesce(f_name, 'all_students') as first_name, 
    SUM(num_courses) AS total_courses
FROM 
    TARP_STUDENT S, TARP_JOINED_BY J
WHERE 
    S.username = J.username
GROUP BY ROLLUP (community_id, f_name);