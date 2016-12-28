package crossroad0201.aws.flywaylambda.deploy

import com.amazonaws.services.lambda.runtime.Context

import scala.util.Try

trait FlywayDeployer {

  def deploy(flywayConfFileName: String)(implicit context: Context): Try[FlywayDeployment]

}
