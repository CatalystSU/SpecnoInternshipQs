console.log("test")

const inquirer = require('inquirer')

var questions = [{
  type: 'input',
  name: 'value',
  message: "What is your integer?",
}]

inquirer.prompt(questions).then(answers => {
    var val = parseInt(answers['value'])
    var temp = 1
    for (let index = 1; index < val; index++) {
        temp  = temp * (index + 1);
    }
    console.log(answers['value']+"! = " + temp)
})