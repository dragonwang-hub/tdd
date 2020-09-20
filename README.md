### 需求
You are given strings of different lengths.
 
If the number of vowels (aeiou) are more than 30% of the string length 
then insert ‘mommy’ for each continuous set of vowels.

### 要求
- 使用TDD方式实现上述需求，注意TDD Cycle（红-绿-重构）
- YAGNI
- 小步提交
- TIPS：注意测试用例的完整性

### tasking
You are given strings of different lengths.
 
If the number of vowels (aeiou) are more than 30% of the string length 
then insert ‘mommy’ for each continuous set of vowels.

1.Given string is null
2.When	convert
3.Then	return null

1.Given the number of vowels less than 30per of string
2.When	convert
3.Then	return itself
（此处是两个，一个为“”空字符串，一个是正常字符串）

1.Given the number of vowels more than 30per of string but not have continuous set of vowels
2.When	convert
3.Then	return itself

1.Given the number of vowels more than 30per of string and have continuous set of vowels
2.When	convert（此处决定插入几次mommy）
3.Then	return insert ‘mommy’
（这一条写二个测试：插入一次，插入一次后检测再插入一次，