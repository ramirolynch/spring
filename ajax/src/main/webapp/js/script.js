var xhr;

function getEmployeeDetails(empno)
{
	xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = stateChanged;
	
	xhr.open("GET", "search?eno="+empno, true); //true-asynchronous communication
	
	xhr.send();
}

function stateChanged()
{
	var name = 'NO MATCH';
	var sal = 'NO MATCH';
	
	if(xhr.readyState==4 && xhr.status==200){
		var responseText = xhr.responseText;
		
		if(responseText.length > 0){
			var responseObj = JSON.parse(responseText);
			
			name = responseObj.ename;
			sal = responseObj.esal;
		}
		document.getElementById('emp-name').innerHTML = name;
		document.getElementById('emp-sal').innerHTML = sal;	
	}
}