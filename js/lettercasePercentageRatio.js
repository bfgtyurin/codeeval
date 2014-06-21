var fs  = require('fs');
fs.readFileSync(process.argv[2]).toString().split('\n').forEach(function (line) {
    if (line !== '') {
      solution(line.trim());
    }
});

function solution(line) {
  var arr = line.split('');
  var lowerC;
  var upperC;
  var uCount = 0;
  var length = arr.length;
  var result;
  arr.forEach(function(element) {
    if (element === element.toUpperCase()) {
      uCount++;
    }
  });
  lowerC = length - uCount;
  lowerC = (lowerC * 100 / length).toFixed(2);
  upperC = (100 - lowerC).toFixed(2);
  result = 'lowercase: ' + lowerC + ' uppercase: ' + upperC;
  console.log(result);
}