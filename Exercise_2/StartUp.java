//abbi setyo wiratama wicaksono
//1301140321
public class StartUp{
 	private Member[] member = new Member[50];
 	private Project[] projectList = new Project[50];
 	private int nMember = 0;
 	private int nProject = 0;
 	
 	public void addMember(Member m){
 		if(nMember<member.length){
 			member[nMember] = m;
 			nMember++;
 		}
 		else{
 			System.out.println("Array Full ! ");
 		}
 	}
 	
 	public Member getMember(int id){
 		return member[id];
 	}
 	
 	public void createNewProject(String projectName){
 		Project project = new Project(projectName);
 		if(nProject<projectList.length){
 			projectList[nProject] = project;
 			nProject++;
 		}
 		else{
 			System.out.println("Array Full");
 		}
 	}
 	
 	public Project getProject(int id){
 		return projectList[id];
 	}
 	
 	public void setProjectMember(Project p, Member m){
 		p.addMember(m);
 	}
 	
 	public void releaseProject(Project p){
 		p.releaseApp();
 	}
 	
 	public int getNumReleasedProject(){
 		int num = 0;
 		for (int i=0; i<nProject;i++){
 			if(projectList[i].isReleased() == true){
 				num++;
 			}	
 		}
 		return num;
 	}
 }
