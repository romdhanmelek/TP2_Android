# TP2_Android

TP2.1:

* Question 1
Quelles modifications sont apportées lorsque vous ajoutez une deuxième activité à votre application en choisissant File > New > Activity et un modèle d'activité? Choisissez-en un:

-> La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxième activité.

* Question 2
Que se passe-t-il si vous supprimez les éléments android:parentActivityName et <méta-data> de la deuxième déclaration d'activité du fichier AndroidManifest.xml? Choisissez-en un:

-> Le bouton Up (Haut) de la barre d'applications n'apparaît plus dans la deuxième activité pour renvoyer l'utilisateur à l'activité parent.

* Question 3
Quelle méthode de constructeur utilisez-vous pour créer une nouvelle intention (Intent) explicite? Choisissez-en un:

-> new Intent(Context context, Class<?> class)

* Question 4
Dans l'application HelloToast (du Travail à faire), comment ajoutez-vous la valeur actuelle du comptage à l'intention (Intent)? Choisissez-en un:

-> Comme extra d'intention (Intent)

* Dans l'application HelloToast (du Travail à faire), comment afficher le nombre actuel dans la deuxième activité "Hello"? Choisissez-en un:

-> Tout ce qui précède.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

TP2.2


* Question 1
Si vous exécutez l'application de travail à faire avant d'implémenter onSaveInstanceState(), que se passe-t-il si vous faites pivoter le périphérique? Choisissez-en un:

-> Le compteur est réinitialisé à 0, mais le contenu de l'EditText est préservé.

* Question 2
Quelles méthodes de cycle de vie d'activité sont appelées lorsqu'un changement de configuration de périphérique (tel qu'une rotation) se produit? Choisissez-en un:

-> Android arrête votre activité en appelant onPause(), onStop() et onDestroy(), puis redémarre l'opération en appelant onCreate(), onStart() et onResume().

* Question 3
Lorsque dans le cycle de vie de l'activité, onSaveInstanceState() est appelé? Choisissez-en un:

-> onSaveInstanceState() est appelée avant la méthode onStop().

* Question 4
Quelles méthodes de cycle de vie d'Activité sont les meilleures à utiliser pour enregistrer des données avant la fin ou la destruction de l'activité? Choisissez-en un:

-> onPause() ou onStop()

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

TP2.3

* Question 1
Quelle méthode de constructeur utilisez-vous pour créer une intention implicite de lancer une application de caméra?

-> new Intent(String action)

* Question 2
Lorsque vous créez un objet Intention implicite, lequel des énoncés suivants est vrai?

-> Ne spécifiez pas l'activité ou autre composant spécifique à lancer.

* Quelle action Intention utilisez-vous pour prendre une photo avec une application appareil photo?

-> Intent takePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
