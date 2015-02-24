package JavaMisc;


	public class Employee
	{
		private String employeeName;
		private int employeeID;
		private String employeeTitle;
		
		public Employee(String name, int id, String title)
		{
			this.employeeID = id;
			this.employeeName  = name;
			this.employeeTitle = title;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public int getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}
		public String getEmployeeTitle() {
			return employeeTitle;
		}
		public void setEmployeeTitle(String employeeTitle) {
			this.employeeTitle = employeeTitle;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + employeeID;
			result = prime * result
					+ ((employeeName == null) ? 0 : employeeName.hashCode());
			result = prime * result
					+ ((employeeTitle == null) ? 0 : employeeTitle.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (employeeID != other.employeeID)
				return false;
			if (employeeName == null) {
				if (other.employeeName != null)
					return false;
			} else if (!employeeName.equals(other.employeeName))
				return false;
			if (employeeTitle == null) {
				if (other.employeeTitle != null)
					return false;
			} else if (!employeeTitle.equals(other.employeeTitle))
				return false;
			return true;
		}

}

