angular.module('dismissableAlerts', [])
  .directive('dismissableAlertInfo', function(){
    var ddo = {};
    ddo.restric = "AE";
    ddo.transclude = true;

    ddo.scope = {
      title: '@'
    };
    ddo.templateUrl = appHelper.directiveDir + '/alerts/views/dismissable-alert-info.html';

    return ddo;
  })
  .directive('dismissableAlertWarning', function(){
    var ddo = {};
    ddo.restric = "AE";
    ddo.transclude = true;

    ddo.scope = {
      title: '@'
    };
    ddo.templateUrl = appHelper.directiveDir + '/alerts/views/dismissable-alert-warning.html';

    return ddo;
  })
  .directive('dismissableAlertDanger', function(){
    var ddo = {};
    ddo.restric = "AE";
    ddo.transclude = true;

    ddo.scope = {
      title: '@'
    };
    ddo.templateUrl = appHelper.directiveDir + '/alerts/views/dismissable-alert-danger.html';

    return ddo;
  })
  .directive('dismissableAlertSuccess', function(){
    var ddo = {};
    ddo.restric = "AE";
    ddo.transclude = true;

    ddo.scope = {
      title: '@'
    };
    ddo.templateUrl = appHelper.directiveDir + '/alerts/views/dismissable-alert-success.html';

    return ddo;
  });
