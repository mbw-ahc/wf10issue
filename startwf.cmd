IF [%JBOSS_HOME%] == [] (
	echo JBOSS_HOME not set
	goto END
)


COPY standalone-ha-sso.xml %JBOSS_HOME%\standalone\configuration
cd %JBOSS_HOME%\bin
call standalone.bat --server-config=standalone-ha-sso.xml


:END
EXIT /B
