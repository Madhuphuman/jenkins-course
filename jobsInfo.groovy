for (i=1; i<=10; i++)
job("seedJobExtraTask-$i")
{
  steps{
    shell('echo $JOB_NAME $BUILD_NUMBER')
  }
}
