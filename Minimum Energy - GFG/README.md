# Minimum Energy
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array containing positive and negative numbers. The array represents checkpoints from one end to other end of street. Positive and negative values represent amount of energy at that checkpoint. Positive numbers increase the energy and negative numbers decrease. Find the minimum initial energy required to cross the street such that Energy level never becomes 0 or less than 0.</span></p>

<p><span style="font-size:18px"><strong>Note :</strong>&nbsp; The value of minimum initial energy required will be 1 even if we cross street successfully without loosing energy to less than and equal to 0 at any checkpoint. The 1 is required for initial check point.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>
N = 5
A[] = {4, -10, 4, 4, 4}
<strong>Output</strong>
7
<strong>Explanation</strong>
By having an initial energy of 7 we can
make sure that all the checkpoints are
visited and the fuel never reaches 0
or less value.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>
N = 5
A[] = {3, 5, 2, 6, 1}
<strong>Output</strong>
1
<strong>Explanation</strong>
We need at least 1 initial energy
to reach first checkpoint.</span></pre>

<p><br>
<br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You <strong>don't</strong> need to print anything, printing is done by the driver code itself. You need to complete the function <strong>minEnergy() </strong>which takes the array <strong>A[]</strong> and its size <strong>N</strong><strong> </strong>as inputs and returns the minimum initial energy required to cross the street.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N)<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
-10<sup>3</sup> ≤ A[i] ≤ 10<sup>3</sup></span></p>
</div>