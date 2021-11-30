# fitapp
A fun group project for leisure 

# How to git commit 
When a feature is assigned to you, you create a branch for it, 
then you commit your progress to this branch when committing, 
it is important that you add the issue id, for example "implemented function create exercise #34" when your feature is complete, 
you merge your feature branch with the dev branch.

Your feature issue number can be found in the issue dashboard of Github.

# Key elements 
- Personalization 
  - Setting goals
  - Avatar 
  - Profile info 
  - Main background change personal picture's / welcome screen photo doing workout 
- Activity summaries / graphs 
- Gamification 
  - Location based overview with exercises from others around you. follow person or adopt exercise 
  - exp/levels public list 
  - Social Pressure (badges / friends) "trained for x hours in 1 day", "trained x days in a row"
    
    Go easy on the rewards. Keep rewards in the proper perspective. A true interest in and engagement with the content should be the greatest motivator as opposed to a reward.
  - Assessment reach goal 
  - Microinteractions
  - Role-play traint like a knight 
  - Narrative / Story telling 
  - Consequences when user does not interract 
  - Time Dependent Rewards
  - Unlockable / Rare Content 
  - Quests
  - Boss Battles train against a knight 
  - Gifting / Sharing share cool items or schema's 
  - Voting exercise 
  - The difficulty should grow incrementally and should have random easy days
  
  - Live: when doing a workout with friend your friend should be able see updates and finised workout instantly (websocket)
- Exercise:
  - Layout data structure   
    ``` json
    {
      "meta": {
        "weight_unit": "KG"
      },
      "workout": [
        {
          "id": 1,
          "title": "Back & Biceps",
          "dates": [
            {
              "date": "30-11-2021",
              "started_at": "19:00",
              "ended_at": "20:30",
              "completed_exercises": [
                {
                  "exercises_id": 1,
                  "note": "Less than previous sessions due to arm injury",
                  "reps": [
                   {
                      "set": 1,
                      "amount": 78,
                      "reps": 8
                    },
                    { 
                      "set": 2,
                      "amount": 78,
                      "reps": 8
                    },
                    { 
                      "set": 3,
                      "amount": 78,
                      "reps": 5
                    }
                  ]
                },
                {
                  "exercises_id": 2,
                  "note": null,
                  "reps": [
                   {
                      "set": 1,
                      "amount": 40,
                      "reps": 10
                    },
                    { 
                      "set": 2,
                      "amount": 40,
                      "reps": 10
                    },
                    { 
                      "set": 3,
                      "amount": 40,
                      "reps": 10
                    }
                  ]
                }
              ]
            }
          ],
          "exercises_in_this_workout": [
            1, 
            2
          ]
        }
      ],
      "exercises": [
        {
          "id": 1,
          "name": "Pull up",
          "video": "pull_up.mp4"
        },
        {
          "id": 2,
          "name": "Bicep Curl (Cable)",
          "video": "bicep_curl_cable.mp4"
        }
      ]
    }
    ```
  - Based on workout calculate calorie burn
- Social sharing interact with friends 
- Exercise examples / Video tutorials
- Pair with fitness devices such as watch 
- Rep intervals, cardio, and weigh-in days excercise presets 
- Easter Eggs
- Data privacy is taken seriously Anonymity
- All of the content should support the learning objectives. Learn the user how to eat healthy and how to preform an exercise and where the focus lies.

Easy sign-up – and onboarding for paid subscribers
Convenience – with personalized notifications
It builds loyalty – with an engaging experience


No fcking adds 
Paid subscription with psychological manipulation on the user 

# AI
- Take a picture of the image on the fitness device recognize the fitness exercise 
- Keeping track of nutritional intake, we can do this for example by using an api and scanning a barcode or an AI that scans an image of a product and recognizes and converts the nutritional values from it.


# Mood module goal's
- Sleep:red < 5.5 | yellow < 7 | green > 7
  - Gone to bed time: time
  - Woke up time: time 
- Social media hours: red > 8 | yellow > 5 | green < 5
- Reading: boolean | red = false | green = true or red less than 3 times a week
- Sport: boolean | red = false | green = true or red less than 3 times a week
- Alcohol/drug: boolean | red = false | green = true or red less than 3 times a week
- Contact friend's in person: boolean
- Contact friend's via social: boolean
- Energie level: 1 to 10
- Worked: boolean 
- Left the house: boolean 
  - Locations:
  - Forest hours: 
  - Steps:
- What did you eat: 

- Notes about your day
