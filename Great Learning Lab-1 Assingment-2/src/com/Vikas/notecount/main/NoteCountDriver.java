package com.Vikas.notecount.main;

import java.util.Scanner;

import com.Vikas.notecount.service.MergeSort;
import com.Vikas.notecount.service.NoteCount;

public class NoteCountDriver {
	
	public static void main(String args[]) {
		MergeSort mer= new MergeSort();
		NoteCount note = new NoteCount();
		
		System.out.println("Enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] notes = new int[size];
		System.out.println("Enter the currency denominations value ");
		for(int i=0;i <size; i++) {
			notes[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you wnat to pay");
		int amount=sc.nextInt();
		mer.sort(notes,0,notes.length-1);
		note.notesCountImplimentation(notes,amount);
		sc.close();
	}
}