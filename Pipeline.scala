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


# Part - 1 (Build the object and logger)

object map_pipeline extends LazyLogging  {

  val snowflakeScriptRunnerClass = "xyz"
  val tableauRefresh = "xyz"
  val pipelineName = "Snowflake - aip"
  val pipelineDescription = "aip pipeline and dashboard refresh"

  val dashboard_list = List(
      "::Automation::Automation Insights Metrics"
  )

#  Explanation:- 

  // Class – you can make many copies
class Dog
val d1 = new Dog()
val d2 = new Dog() // ✅ Multiple instances

// Object – only one copy ever
object DogTrainer
// You can't do: new DogTrainer() ❌


- This creates a singleton object (i.e., only one instance of it will ever exist).

- It's like a main class in Java.

- This is where your pipeline starts — the "main brain" of the automation.


Lazy Logging 

- It adds logging functionality to your Scala object
- great for debugging, monitoring, and auditing
- Lazy means the logger is only created when it’s first used, not immediately when the object loads
- By extending LazyLogging, it gets access to a built-in logger, 
  which we use to log important information like process start, success, errors, and debug messages.

val is used for defining immutable variables in scala 














  
