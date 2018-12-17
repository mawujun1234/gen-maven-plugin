package com.mawujun.genmt;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
/**
 * 使用方法，添加插件：
 * M和T的自动生成插件：
<plugins>
			<plugin>
				<groupId>com.mawujun</groupId>
				<artifactId>gen-maven-plugin</artifactId>
				<version>1.0</version>
				<executions>
					<execution>
						<phase>compile</phase>
						<goals>
							<goal>genmt</goal>
						</goals>
					</execution>					 
				</executions>
			</plugin>
		</plugins>
		或者执行命令 gen:genmt

 * @author admin
 *
 */
@Mojo( name = "genmt",defaultPhase=LifecyclePhase.COMPILE)
public class GenmtMojo extends AbstractMojo {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		// TODO Auto-generated method stub
		 getLog().info( "Hello, world." );
		 getLog().info("================================");
		 getLog().info("==========================================");
			getLog().info("==========================================");
			getLog().info("==========================================");
			getLog().info("==========================================");
			getLog().info("==========================================");
			getLog().info("==========================================");
			getLog().info("==========================================");
			getLog().info("==========================================");

	}

}
