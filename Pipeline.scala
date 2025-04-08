# Building a pipeline in scala to refresh the dashboards for the analytics teams.


This is an automated data processing and dashboard refresh pipeline that:

- Runs a series of Snowflake SQL scripts that prepare/aggregate data.

- Refreshes specific Tableau dashboards to reflect the newly processed data.

Component	- Description
Scala	- The main language used for orchestration.
Snowflake -	The cloud data warehouse where SQL scripts are run.
Tableau -	Used to visualize the processed metrics. The dashboards are refreshed.
Job Launcher Framework -	Custom framework built in-house using DSLs to define and validate pipelines.
Artifacts	Bundled code/resources like SQL scripts used in the pipeline.
Pipeline DSL -	Used to define stages (.fork) and jobs (.java) in the pipeline.
RunMode -	Specifies if this is a test or production run.
