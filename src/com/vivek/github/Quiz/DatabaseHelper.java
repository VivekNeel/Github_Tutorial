package com.vivek.github.Quiz;
import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "Github Quiz";
	private static final String TABLE = "quest";
	private static final String ID = "id";
	private static final String QUESTIONS = "question";
	private static final String ANSWER = "answer"; 
	private static final String OPTION_A= "option_a"; 
	private static final String OPTION_B= "option_b"; 
	private static final String OPTION_C= "option_c"; 
	private SQLiteDatabase de;
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		de=db;
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE + " ( "
				+ ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + QUESTIONS
				+ " TEXT, " + ANSWER+ " TEXT, "+OPTION_A +" TEXT, "
				+OPTION_B +" TEXT, "+OPTION_C+" TEXT)";
		db.execSQL(sql);		
		addQuestions();
		
	}
	private void addQuestions()
	{
		Question q1=new Question(" Git was started by" +
				" ?","Linus Trovalds", "Dennis Ritchie", "James Gosling", "Linus Trovalds");
		this.addQuestion(q1);
		Question q2=new Question("Command used to install git on debian based linux distribution" +
				"?", "apt -get install git", "apt-get install git", "yum install git", "apt-get install git");
		this.addQuestion(q2);
		Question q3=new Question("How do you check your config settings" +
				" ?","git config --list", "git --config","git config","git config --list");
		this.addQuestion(q3);
		Question q4=new Question("Command used to initialize repository" +
				"?",	"git i", "git init -m", "git init","git init");
		this.addQuestion(q4);
		Question q5=new Question("Command used for committing" +
				" ?","git c","git -commit","git commit -m","git commit -m");
		this.addQuestion(q5);
		
		Question q6=new Question("How do you create branch with the name xda" +
				" ?","git xda branch ", "git checkout branch", "git branch xda", "git branch xda");
		this.addQuestion(q6);
		Question q7=new Question("Which of the following is correct the Syntax for adding new remote " +
				"?", "git remote add [url][alias]", "git remote add [alias][url]", "git remote add [url] -[alias]", "git remote add [alias][url]");
		this.addQuestion(q7);
		Question q8=new Question("How do you rename a file called git to github" +
				" ?","git rename git github", "git rename github git","git mv git github","git mv git github");
		this.addQuestion(q8);
		Question q9=new Question("Which is the correct syntax for deleting all the .txt files from the" +
				" directory github?",	"git rm github*.txt", "git rm github/txt", "git rm github.txt","git rm github*.txt");
		this.addQuestion(q9);
		Question q10=new Question("Which of the following is the command for creating a branch github and navigating" +
				" to github?","git checkout github","git checkout -b github","git -b checkout github","git checkout -b github");
		this.addQuestion(q10);
		
		Question q11=new Question(" How do you configure git to pull changes from the" +
				" original repository?","git remote add upstream repo_url", "git remote add repo_url", "git remote clone upstream repo_url", "git remote add upstream repo_url");
		this.addQuestion(q11);
		Question q12=new Question("Which of the following is the correct syntax for  " +
				"seeing both staged and unstaged changes together?", "git diff --cached", "git diff", "git diff HEAD", "git diff HEAD");
		this.addQuestion(q12);
		Question q13=new Question("How do you see the last commit on each branch" +
				" ?","git branch -d", "git branch -l","git branch -v","git branch -v");
		this.addQuestion(q13);
		Question q14=new Question("Which command will you use for adding all the files that are changed while commiting" +
				" ?",	"git add .", "git add", "git add all","git add .");
		this.addQuestion(q14);
		Question q15=new Question("How do you unstage file from the index" +
				" ?","git reset HEAD","git reset","git reset --hard","git reset HEAD");
		this.addQuestion(q15);
		
		Question q16=new Question(" Which of the following git tool is used for " +
				" Showing all the commit messages?","git log -m", "git history", "git log", "git log");
		this.addQuestion(q16);
		Question q17=new Question("How to merge a branch called xda into master branch?" +
				"?", "git merge xda master", "git merge xda", "git merge -xda", "git merge xda");
		this.addQuestion(q17);
		Question q18=new Question("Which of the following is the correct syntax" +
				" for listing all your remote aliases?","git remote aliases", "git -r","git remote","git remote");
		this.addQuestion(q18);
		Question q19=new Question("Which of the following is the correct syntax for" +
				" fetching single tag?",	"git fetch origin --tags", "git fetch tag origin", "git fetch tag","git fetch origin --tags");
		this.addQuestion(q19);
		Question q20=new Question("What is the use of git fetch command" +
				" ?","Use to download a repository","Use to download new branches and data","Used to Sync with tags  ","Use to download new branches and data");
		this.addQuestion(q20);
		
		
		Question q21=new Question(" What does cherrypicking means" +
				" ?","Kanging someone commits from one branch to apply it on other branch", "pushing your local branch to a remote repository", "push your local repository to a github", "Kanging someone commits from one branch to apply it on other branch");
		this.addQuestion(q21);
		Question q22=new Question("Which one of the commands will you use while cherrypicking commits from github" +
				"?", "git cherrypick commit_ID", "git fetch commit_ID", "git cherry-pick commit_ID", "git cherry-pick commit_ID");
		this.addQuestion(q22);
		Question q23=new Question("Which one of the following is used for deleting a repo directory named nexus?" +
				" ?","git rm nexus ", "git rm rf nexus","git rm -r nexus","git rm -r nexus");
		this.addQuestion(q23);
		Question q24=new Question("Which one of the following is not the usage of git rebase" +
				"?",	"Use to combine a series of branch", "Use to edit previous commit messages", "Use to combine multiple commits into one","Use to combine a series of branch");
		this.addQuestion(q24);
		Question q25=new Question("How to rebase all the commits between another branch and the current branch" +
				" ?","git rebase other_branch_name","git rebase -interactive other_branch_name","git rebase --interactive other_branch_name","git rebase --interactive other_branch_name");
		this.addQuestion(q25);
		
		Question q26=new Question(" How to rebase the last few commits into your current branch" +
				" ?","git rebase --commits HEAD~7", "git rebase --interactive HEAD~7", "git rebase --commits HEAD", "git rebase --interactive HEAD~7");
		this.addQuestion(q26);
		Question q27=new Question("Which command allows you to continue processing the rest of the rebase" +
				"?", "git rebase --continue", "git rebase --interactive continue", "git rebase -c", "git rebase --continue");
		this.addQuestion(q27);
		Question q28=new Question("After adding the subproject how can you update the subproject to keep in sync with the upstream changes " +
				" ?","git pull subtree remotename branchname", "git upstream subtree remotename branchname","git pull -s subtree remotename branchname","git pull -s subtree remotename branchname");
		this.addQuestion(q28);
		Question q29=new Question("How to copy the git history of xda project into the newly created directory developer" +
				" ?",	"git read-tree --prefix=xda/ -u xda/master", "git read-tree --prefix=xda/ -u developer/master", "git read-tree --prefix=developer/ -u xda/master","git read-tree --prefix=xda/ -u developer/master");
		this.addQuestion(q29);
		Question q30=new Question("Which one of the following commands used for cloning a repo?" +
				" interpreted language?","git clone repo_url","git --clone repo_url","git c repo_url","git clone repo_url");
		this.addQuestion(q30);
		
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		
		db.execSQL("DROP TABLE IF EXISTS " + TABLE);
		onCreate(db);
	}
	// Adding new question
	public void addQuestion(Question quest) {
		
		ContentValues values = new ContentValues();
		values.put(QUESTIONS, quest.getQUESTION()); 
		values.put(ANSWER, quest.getANSWER());
		values.put(OPTION_A, quest.getOPTION_A());
		values.put(OPTION_B, quest.getOPTION_B());
		values.put(OPTION_C, quest.getOPTION_C());
		// Inserting Row
		de.insert(TABLE, null, values);		
	}
	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		
		String selectQuery = "SELECT  * FROM " + TABLE;
		de=this.getReadableDatabase();
		Cursor cursor = de.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTION_A(cursor.getString(3));
				quest.setOPTION_B(cursor.getString(4));
				quest.setOPTION_C(cursor.getString(5));
				quesList.add(quest);
			} while (cursor.moveToNext());
		}
		
		return quesList;
	}
	public int rowcount()
	{
		int row=0;
		String selectQuery = "SELECT  * FROM " + TABLE;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		row=cursor.getCount();
		return row;
	}
}
