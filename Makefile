generate-question:
	git checkout -b $(branchName)
	@-cd  ./coding/solutions/src/main/java/xyz/grind/coding/$(folderName);\
	touch $(codeFileName).java;\
	cd  ../../../../../../../../;\
	cd  ./solutions/src/test/java/$(folderName);\
	touch $(codeFileName)Test.java;\
	cd  ../../../../../;\
	cd ./docs/$(folderName)/questions;\
	touch $(docFileName).md;\
	cd ../../$(folderName);\
	echo "\n| $(shell date +"%d.%m.%Y - %H:%M") | [$(subst -, ,$(docFileName))](https://leetcode.com/problems/$(shell echo ${docFileName:2})/) | [Solutions](https://github.com/humamaboalraja/grind.xyz/blob/fix/doc/coding/docs/$(folderName)/questions/$(docFileName).md) |  <img src="https://img.shields.io/badge/Arrays-333333.svg" height="23"/> | <img src="https://img.shields.io/badge/Hashtable-69314C.svg" height="23"/> | <img src="https://img.shields.io/badge/Easy-1faf25.svg" height="23"/> | High |  Summary Description |"  >> README.md;\
	echo "\n Question's solution, test and document file were generated 🎉 \n"

track-files:
	@-git add .;\
	git commit -m "feat: Add \`$(question)\` question & solution appraoches";\
	git push origin $(shell git rev-parse --abbrev-ref HEAD)
	echo "\n Your questions has been added 🎉 \n"
