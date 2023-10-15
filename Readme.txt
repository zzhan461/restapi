POST:
Endpoint: /alerts 
Request Body: 
{ 
 "alert_id": "b950482e9911ec7e41f7ca5e5d9a424f", 
 "service_id": "my_test_service_id", 
 "service_name": "my_test_service", 
 "model": "my_test_model", 
 "alert_type": "anomaly", 
 "alert_ts": "1695644160", 
 "severity": "warning", 
 "team_slack": "slack_ch" 
} 


GET:
Endpoint: /alerts 
Query Parameters: 
service_id: The identifier of the service for which alerts are requested. 
start_ts: The starting timestamp epoch of the time period. 
end_ts: The ending timestamp epoch of the time period. 
Example: /alerts? 
service_id=my_test_service_id&start_ts=1695643160&end_ts=1695644360 Read Response 
Success 
HTTP Status Code: 200 OK 
Response Body: 
{ 
 "service_id" : "my_test_service_id" 
 "service_name": "my_test_service", 
 "alerts" : [ 
 { 
 "alert_id": "b950482e9911ec7e41f7ca5e5d9a424f", 
 "model": "my_test_model", 
 "alert_type": "anomaly", 
 "alert_ts": "1695644060", 
 "severity": "warning", 
 "team_slack": "slack_ch" 
 }, 
 { 
 "alert_id": "b950482e9911ecsdfs41f75e5d9az23cv",  "model": "my_test_model", 
 "alert_type": "anomaly", 
 "alert_ts": "1695644160", 
 "severity": "warning", 
 "team_slack": "slack_ch" 
 }, 
 ] 
}
