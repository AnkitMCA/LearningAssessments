// Question 1
function calculateSI() {
    var principle=prompt("Enter the Principal Value(in Rs.) ");
    var rate=prompt("Enter the Rate in % ");
    var time=prompt("Enter the Time in years ");
    if(principle =="" || rate =="" || time == "")
    {
        alert("Alert : Enter values ")
    }
    var result=principle*rate*time/100;
    alert("Simple Interest : "+result)
    document.getElementById("rslt").innerHTML= '<p> Simple Interest : '+result+'</p>';
}

//Question 2
function isPalindrome() {
    var string = prompt("Enter a string");
    var i;
    var string2="";
    for(i=string.length-1;i>=0;i--)
    {
        string2+=string.charAt(i);
    }
    if (string==string2)
    {
        alert("String is Palindrome")
    }
    else {
        alert("Not Palindrome")
    }
}

// Question 3
function CalculateArea(){
    var radius=prompt("Enter the Radius ");
    let area=radius*radius*Math.PI;
    document.getElementById("rslt").innerHTML= "<p> Area of Circle : "+area+"</p>";
}

// Question 4
var obj = {
    "name": "Ankit",
    "org" : "To The New"
}
function copyObject() {

    var objCopy={}
    let i;
    for (i in obj){
        objCopy[i]=obj[i];
    }
    document.getElementById("rslt").innerHTML= JSON.stringify(objCopy);
}

// Question 5
var mylist = [
    {
        name: 'Prabh',
        age: 22,
        salary: 3000,
        DOB: '03/01/1995'
    },
    {
        name: 'Harsh',
        age: 19,
        salary: 7000,
        DOB: '11/03/1999'
    },
    {
        name: 'Adi',
        age: 18,
        salary: 11000,
        DOB: '24/05/2000'
    },
    {
        name: 'ABC',
        age: 23,
        salary: 900,
        DOB: '24/05/1995'
    },
    {
        name: 'XYZ',
        age: 25,
        salary: 850,
        DOB: '24/05/1993'
    },
    {
        name: 'Ankit',
        age: 21,
        salary: 4500,
        DOB: '30/09/1996'
    },
    {
        name: 'Sumit',
        age: 18,
        salary: 15000,
        DOB: '30/07/2000'
    },
    {
        name: 'Sanju',
        age: 19,
        salary: 4000,
        DOB: '30/09/1999'
    }
];

function createlist() {
    var outputlist=[];
    var i;
    for (i=0;i<mylist.length;i++)
    {
        console.log(mylist[i]);
        outputlist.push(mylist[i]);
    }
    document.getElementById("rslt").innerHTML=JSON.stringify(outputlist);
}

function filterlist() {
    var filter_output=[];
    var i;
    for (i=0;i<mylist.length;i++)
    {
        if(mylist[i].salary>5000) {
            console.log(mylist[i]);
            filter_output.push(mylist[i]);
        }
    }
    document.getElementById("rslt").innerHTML=JSON.stringify(filter_output);
}

function grouplist() {
    var group_output={};
    var i;
    for (i=0;i<mylist.length;i++){
        if (!group_output[mylist[i].age])
        {
            group_output[mylist[i].age]=[mylist[i]];
        }
        else
        {
            group_output[mylist[i].age].push(mylist[i]);
        }
    }
    document.getElementById("rslt").innerHTML=JSON.stringify(group_output);
}

function fetchsalary() {
    var salary_output=[];
    var i;
    for(i=0;i<mylist.length;i++)
    {
        salary_output.push(mylist[i]);
        if(mylist[i].salary < 1000 && mylist[i].age >20)
        {
            salary_output[i].salary=5*(salary_output[i].salary);
        }
    }
    document.getElementById("rslt").innerHTML = JSON.stringify(salary_output);
}