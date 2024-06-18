{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 8,
   "id": "f8442d26-3bab-425f-a341-82f4e85df136",
   "metadata": {},
   "outputs": [],
   "source": [
    "import java.util.Scanner;\n",
    "\n",
    "public class SimpleScannerExample {\n",
    "    public static void main(String[] args) {\n",
    "        // Scanner 객체를 생성하여 System.in을 입력으로 받음\n",
    "        Scanner scanner = new Scanner(System.in);\n",
    "\n",
    "        // 사용자에게 첫 번째 숫자를 입력하라고 요청\n",
    "        System.out.print(\"Enter the first number: \");\n",
    "        int firstNumber = scanner.nextInt();\n",
    "\n",
    "        // 사용자에게 두 번째 숫자를 입력하라고 요청\n",
    "        System.out.print(\"Enter the second number: \");\n",
    "        int secondNumber = scanner.nextInt();\n",
    "\n",
    "        // 두 숫자의 합을 계산\n",
    "        int sum = firstNumber + secondNumber;\n",
    "\n",
    "        // 결과 출력\n",
    "        System.out.println(\"The sum of \" + firstNumber + \" and \" + secondNumber + \" is \" + sum);\n",
    "\n",
    "        // Scanner 객체를 닫음\n",
    "        scanner.close();\n",
    "    }\n",
    "}\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 11,
   "id": "d5f4466c-706a-459f-8404-5a9a4684a6c2",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Enter the first number: "
     ]
    },
    {
     "name": "stdin",
     "output_type": "stream",
     "text": [
      " 3\n"
     ]
    },
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Enter the second number: "
     ]
    },
    {
     "name": "stdin",
     "output_type": "stream",
     "text": [
      " 5\n"
     ]
    },
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "The sum of 3 and 5 is 8\n"
     ]
    }
   ],
   "source": [
    "SimpleScannerExample.main(new String[0])"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 12,
   "id": "b17c923c-7eb8-4b51-8070-955151f62345",
   "metadata": {},
   "outputs": [
    {
     "ename": "CompilationException",
     "evalue": "",
     "output_type": "error",
     "traceback": [
      "\u001b[1m\u001b[30m|   \u001b[1m\u001b[30mimport \u001b[0m\u001b[1m\u001b[30m\u001b[41morg.apache.spark.sql.Encoders\u001b[0m\u001b[1m\u001b[30m;\u001b[0m",
      "\u001b[1m\u001b[31mpackage org.apache.spark.sql does not exist\u001b[0m",
      ""
     ]
    }
   ],
   "source": [
    "import org.apache.spark.sql.Encoders;\n",
    "import java.io.Serializable;\n",
    "import java.util.ArrayList;\n",
    "\n",
    "public class Bloggers implements Serializable {\n",
    "    private int id;\n",
    "    private String first;\n",
    "    private String last;\n",
    "    private String url;\n",
    "    private String date;\n",
    "    private int hits;\n",
    "    private ArrayList<String> campaigns;\n",
    "\n",
    "    // JavaBean getters and setters\n",
    "    int getID() { return id; }\n",
    "    void setID(int i) { id = i; }\n",
    "\n",
    "    String getFirst() { return first; }\n",
    "    void setFirst(String f) { first = f; }\n",
    "\n",
    "    String getLast() { return last; }\n",
    "    void setLast(String l) { last = l; }\n",
    "\n",
    "    String getURL() { return url; }\n",
    "    void setURL(String u) { url = u; }\n",
    "\n",
    "    String getDate() { return date; }\n",
    "    void setDate(String d) { date = d; }\n",
    "\n",
    "    int getHits() { return hits; }\n",
    "    void setHits(int h) { hits = h; }\n",
    "\n",
    "    ArrayList<String> getCampaigns() { return campaigns; }\n",
    "    void setCampaigns(ArrayList<String> c) { campaigns = c; }\n",
    "\n",
    "    // Create Encoder\n",
    "    Encoder<Bloggers> BloggerEncoder = Encoders.bean(Bloggers.class);\n",
    "    String bloggers = \"java_ex1.json\";\n",
    "\n",
    "    Dataset<Bloggers> bloggersDS = spark\n",
    "        .read()\n",
    "        .format(\"json\")\n",
    "        .option(\"path\", bloggers)\n",
    "        .load()\n",
    "        .as(BloggerEncoder);\n",
    "}\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "21bee723-1a9d-4eb1-b2e3-e6e9fbe8e0e8",
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Java",
   "language": "java",
   "name": "java"
  },
  "language_info": {
   "codemirror_mode": "java",
   "file_extension": ".jshell",
   "mimetype": "text/x-java-source",
   "name": "Java",
   "pygments_lexer": "java",
   "version": "22+36-2370"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}
