# basic-calculator
This is an HTML code for a basic calculator that performs arithmetic operations like addition, subtraction, multiplication, and division. It also includes buttons for square root, percentage, and clear.
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Basic Calculator</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .calculator {
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(224, 214, 214, 0.1);
            border-radius: 5px;
            padding: 20px;
            width: 300px;
            text-align: center;
        }

        h1 {
            color: #4CAF50;
            font-family: 'Times New Roman', Times, serif;
            margin-top: 0;
        }

        input,
        button {
            margin: 5px;
            padding: 10px;
            font-size: 16px;
        }

        input {
            width: 80%;
        }

        button {
            width: 19%;
        }
    </style>
</head>

<body>
    <div class="calculator">
        <h1>Calculator</h1>
        <form method="post" action="{% url 'calculator' %}">
            <input type="text" id="result" name="result" value=" ">
            <br>
            <button onclick="clearResult()">Clear</button>
            <button onclick="appendToResult('/')">/</button>
            <button onclick="squareRoot()">√</button>
            <button onclick="percentile()">%</button>
            
            <br>
            <button onclick="appendToResult('7')">7</button>
            <button onclick="appendToResult('8')">8</button>
            <button onclick="appendToResult('9')">9</button>
            <button onclick="appendToResult('+')">+</button>
            
            <br>
            <button onclick="appendToResult('4')">4</button>
            <button onclick="appendToResult('5')">5</button>
            <button onclick="appendToResult('6')">6</button>
            <button onclick="appendToResult('*')">*</button>
            <br>
            <button onclick="appendToResult('1')">1</button>
            <button onclick="appendToResult('2')">2</button>
            <button onclick="appendToResult('3')">3</button>
            <button onclick="appendToResult('-')">-</button>
            <br>
            <button onclick="appendToResult('.')">.</button>
            <button onclick="appendToResult('0')">0</button>
            <button onclick="deleteNumber()">&larr;</button>
            <button onclick="calculate()">=</button>
            
            

        </form>
    </div>

    <script>
        function appendToResult(value) {
            document.getElementById('result').value += value;
        }

        function clearResult() {
            document.getElementById('result').value = '';
        }

        function deleteNumber() {
            document.getElementById('result').value = document.getElementById('result').value.slice(0, -1);
        }

        function calculate() {
            try {
                document.getElementById('result').value = eval(document.getElementById('result').value);
            } catch (error) {
                document.getElementById('result').value = 'Error';
            }
        }

        function percentile() {
            let value = document.getElementById('result').value;
            if (value !== '') {
                let result = parseFloat(value) / 100;
                document.getElementById('result').value = result.toString();
            }
        }
        function squareRoot() {
            let value = document.getElementById('result').value;
            if (value !== '') {
                let result = Math.sqrt(parseFloat(value));
                document.getElementById('result').value = result.toString();
            }
        }

    </script>
</body>

</html>
