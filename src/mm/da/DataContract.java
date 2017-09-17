package mm.da;

public final class DataContract {

	static class UsersTable{
		public static final String TABLE_NAME = "users";
		public static final String COL_ID = "id";
		public static final String COL_TYPE = "type";
		public static final String COL_FIRSTNAME = "firstName";
		public static final String COL_LASTNAME = "lastName";
		public static final String COL_EMAIL = "email";
		public static final String COL_PHONENUMBER = "phoneNumber";
		public static final String COL_PASSWORD = "password";
		public static final String COL_GENDER = "gender";
		public static final String COL_ADDRESS = "address";
		public static final String COL_NOTES = "notes";
		public static final String COL_PROFILEPICTURE = "profilePicture";
		public static final String COL_ACTIVE = "active";
	}
	
	static class MentorsTable{
		public static final String TABLE_NAME = "mentors";
		public static final String COL_ID = "id";
		public static final String COL_EXPERIENCE = "experience";
		public static final String COL_ROLE = "role";
		public static final String COL_COMPANY = "company";
		public static final String COL_VOLUNTEERING = "volunteering";
		public static final String COL_WORKHISTORY = "workHistory";
	}
	
	static class MenteeTable{
		public static final String TABLE_NAME = "mentees";
		public static final String COL_ID = "id";
		public static final String COL_REMAININGSEMESTERS = "remainingSemesters";
		public static final String COL_GRADUATIONSTATUS = "graduationStatus";
		public static final String COL_ACADEMICINSTITUTE = "academicInstitute";
		public static final String COL_AVERAGE = "average";
		public static final String COL_ACADEMICDICIPLINE1 = "academicDicipline1"; //TODO: update SQL table with new name (courseOfStudy DEPRICATED)
		public static final String COL_ACADEMICDICIPLINE2 = "academicDicipline2"; //TODO: update SQL table with new name (courseOfStudy DEPRICATED)
		public static final String COL_ISGUARANTEE = "isGuarantee";
		public static final String COL_RESUME = "resume";
		public static final String COL_GRADESHEET = "gradeSheet";
	}
	
	static class SessionsTable{
		public static final String TABLE_NAME = "sessions";
		public static final String COL_USERID = "userId";
		public static final String COL_TOEKN = "token";
		public static final String COL_CREATIONDATE = "creationDate";
		public static final String COL_EXPIRATIONDATE = "expirationDate";
		public static final String COL_DEVICEID = "deviceId";
	}
}
