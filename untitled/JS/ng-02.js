var myapp = angular.module('myapp',[]);


myapp.controller('seController',function($scope){

    $scope.dates=new Date();
    setInterval(function(){

        $scope.dates=new Date();

    },1)

    setInterval(function(){
        $scope.$apply(function(){

            $scope.dates=new Date();
        })

    },1000)
})
