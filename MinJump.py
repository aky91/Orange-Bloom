
# https://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/

# Minimum number of jumps to reach end

def minJumpsBU(arr):

	ans = [0 for i in range(len(arr))]
	ans[len(arr) - 1] = 0

	choice = {}

	for start in range(len(arr)-2, -1, -1):

		minJump = len(arr) - 1

		for jump in range(1, arr[start] + 1):

			if(start + jump >= len(arr)):
				break

			jumps = ans[start + jump]

			if jumps < minJump:
				minJump = jumps
				choice[start] = jump + start

		ans[start] = minJump + 1
	
	print("Bottom up : ")

	print(ans[0])
	printAns(arr, choice)

def minJumpsTD(start, arr, dp, choice):

	if start >= len(arr):
		len(arr) - 1

	if start == len(arr) - 1:
		return 0

	if start in dp.keys():
		return dp[start]

	ans = len(arr) - 1

	for jump in range(1, arr[start] + 1):

		if start + jump >= len(arr):
			break

		j = minJumpsTD(start + jump, arr, dp, choice)

		if j < ans:
			ans = j
			choice[start] = start + jump

	dp[start] = ans + 1

	return ans + 1

def printAns(arr, choice):

	idx = 0
	while idx < len(arr):

		if idx == len(arr) - 1:
			print(arr[len(arr) - 1])
			break;

		print(arr[idx], end = " ")
		idx = choice[idx]

def main():

	arr = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]

	dp = {}
	choice = {}

	minJumpsBU(arr)

	print("\nTop down : ")
	print(minJumpsTD(0, arr, dp, choice))	
	printAns(arr, choice)

main()